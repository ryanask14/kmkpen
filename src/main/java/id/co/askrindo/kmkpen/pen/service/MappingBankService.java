package id.co.askrindo.kmkpen.pen.service;

import id.co.askrindo.kmkpen.pen.model.master.MMappingBank;

import java.util.Optional;

public interface MappingBankService {

    Optional<MMappingBank> findByKodeBankAndKodeCabangBank(String kodeBank, String kodeCabangBank);
}
