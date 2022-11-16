package id.co.askrindo.kmkpen.pen.service;

import id.co.askrindo.kmkpen.pen.model.master.MSektorEkonomi;

import java.util.Optional;

public interface MSektorService {

    public Optional<MSektorEkonomi> findByKodeSektor(String kodeSektor);
}
