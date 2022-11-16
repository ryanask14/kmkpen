package id.co.askrindo.kmkpen.pen.impl;

import id.co.askrindo.kmkpen.pen.model.master.MSektorEkonomi;
import id.co.askrindo.kmkpen.pen.repositories.MSektorRepository;
import id.co.askrindo.kmkpen.pen.service.MSektorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MSektorServiceImpl implements MSektorService {

    @Autowired
    MSektorRepository mSektorRepository;

    @Override
    public Optional<MSektorEkonomi> findByKodeSektor(String kodeSektor) {
        return mSektorRepository.findById(kodeSektor);
    }
}
