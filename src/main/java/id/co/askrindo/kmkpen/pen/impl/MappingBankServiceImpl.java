package id.co.askrindo.kmkpen.pen.impl;

import id.co.askrindo.kmkpen.pen.model.master.MBank;
import id.co.askrindo.kmkpen.pen.model.master.MMappingBank;
import id.co.askrindo.kmkpen.pen.repositories.MBankRepository;
import id.co.askrindo.kmkpen.pen.repositories.MMappingBankRepository;
import id.co.askrindo.kmkpen.pen.service.MappingBankService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log
public class MappingBankServiceImpl implements MappingBankService {

    @Autowired
    MMappingBankRepository mMappingBankRepository;

    @Autowired
    MBankRepository mBankRepository;

    @Override
    public Optional<MMappingBank> findByKodeBankAndKodeCabangBank(String kodeBank, String kodeCabangBank) {

        log.info(kodeBank);
        MBank mBank = mBankRepository.findById(kodeBank).get();

        return mMappingBankRepository.findByKodeBankAndKodeCabangBank(mBank, kodeCabangBank);
    }
}
