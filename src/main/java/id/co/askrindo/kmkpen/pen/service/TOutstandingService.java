package id.co.askrindo.kmkpen.pen.service;

import id.co.askrindo.kmkpen.pen.model.TOutstandingTeoritis;
import id.co.askrindo.kmkpen.pen.model.TPenjaminan;
import id.co.askrindo.kmkpen.pen.model.dto.ListOutstanding;

import java.util.List;
import java.util.Set;

public interface TOutstandingService {

    Set<TOutstandingTeoritis> mappingOutstanding(List<ListOutstanding> outstandingList, TPenjaminan tPenjaminan);
    void save(Set<TOutstandingTeoritis> tOutstandingTeoritisSet);
}
