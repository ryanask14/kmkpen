package id.co.askrindo.kmkpen.pen.impl;

import id.co.askrindo.kmkpen.pen.model.LogSikp;
import id.co.askrindo.kmkpen.pen.repositories.LogServiceRepository;
import id.co.askrindo.kmkpen.pen.service.LogService;
import id.co.askrindo.kmkpen.utils.Constants;
import id.co.askrindo.kmkpen.utils.DateUtils;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
@Log
public class LogServiceImpl implements LogService {

    @Autowired
    LogServiceRepository logServiceRepository;

    @Override
    public void insertLog(String noRekening,
                          String nik,
                          String noAplikasi,
                          String serviceName,
                          String jsonBody,
                          String jsonResponse,
                          String message,
                          String noSertifikat,
                          Long idPenjaminan) {

        LogSikp logSikp = new LogSikp();

        logSikp.setCreatedDate(DateUtils.getNow().toInstant());
        logSikp.setIdDebitur(nik);
        logSikp.setIdPenjaminan(null);
        logSikp.setNoRekening(noRekening);
        logSikp.setStatus(null);
        logSikp.setIsActive(false);
        logSikp.setServiceName(serviceName);
        logSikp.setJsonBody(jsonBody);
        logSikp.setJsonResponse(jsonResponse);
        logSikp.setNoSertifikat(noSertifikat);
        logSikp.setNoAplikasi(noAplikasi);
        logSikp.setKeterangan(message);
        logSikp.setIdPenjaminan(idPenjaminan);
        logSikp.setStatus(0);
        try {
            logSikp.setTglPremi(DateUtils.convertToLocalDateViaInstant(DateUtils.parse("19000101", Constants.Parameters.DATE_FORMAT_YYYYMMDD)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        log.info(" logSikp = "+logSikp.toString());

        logServiceRepository.save(logSikp);
    }
}
