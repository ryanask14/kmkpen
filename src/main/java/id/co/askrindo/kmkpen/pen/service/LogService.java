package id.co.askrindo.kmkpen.pen.service;

public interface LogService {

    void insertLog(String noRekening,
                   String nik,
                   String noAplikasi,
                   String serviceName,
                   String jsonBody,
                   String jsonResponse,
                   String message,
                   String noSertifikat,
                   Long idPenjaminan);

}
