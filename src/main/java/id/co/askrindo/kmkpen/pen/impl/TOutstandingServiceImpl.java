package id.co.askrindo.kmkpen.pen.impl;

import id.co.askrindo.kmkpen.pen.model.TOutstandingTeoritis;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.ListOutstanding;
import id.co.askrindo.kmkpen.pen.repositories.TOutstandingRepositories;
import id.co.askrindo.kmkpen.pen.service.TOutstandingService;
import id.co.askrindo.kmkpen.utils.Constants;
import id.co.askrindo.kmkpen.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TOutstandingServiceImpl implements TOutstandingService {

    @Autowired
    TOutstandingRepositories tOutstandingRepositories;

    @Override
    public Set<TOutstandingTeoritis> mappingOutstanding(List<ListOutstanding> outstandingList, TPenjaminan tPenjaminan) {
        Set<TOutstandingTeoritis> outstandingTeoritisSet = new HashSet<TOutstandingTeoritis>();
        TOutstandingTeoritis tOutstandingTeoritis = new TOutstandingTeoritis();

        for(ListOutstanding listOutstanding : outstandingList){
            tOutstandingTeoritis.setOutstanding(listOutstanding.getOutstanding());
            tOutstandingTeoritis.setAngsuranBunga(listOutstanding.getAngsuranBunga());
            tOutstandingTeoritis.setAngsuranDenda(listOutstanding.getAngsuranDenda());
            tOutstandingTeoritis.setAngsuranPokok(listOutstanding.getAngsuranPokok());
            tOutstandingTeoritis.setCreatedBy(Constants.Parameters.CREATED_BY);
            tOutstandingTeoritis.setCreatedDate(DateUtils.getNow().toInstant());
            try {
                tOutstandingTeoritis.setTanggalSaldo(DateUtils.convertToLocalDateViaInstant(DateUtils.parse(listOutstanding.getTanggalSaldo(),"yyyymmdd")));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            tOutstandingTeoritis.setVersion(1);
            tOutstandingTeoritis.setIdPenjaminan(tPenjaminan);
            outstandingTeoritisSet.add(tOutstandingTeoritis);
        }

        return outstandingTeoritisSet;
    }

    @Override
    public void save(Set<TOutstandingTeoritis> tOutstandingTeoritisSet) {
        tOutstandingRepositories.saveAll(tOutstandingTeoritisSet);
    }
}