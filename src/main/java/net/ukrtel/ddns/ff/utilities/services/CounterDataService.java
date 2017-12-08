package net.ukrtel.ddns.ff.utilities.services;

import net.ukrtel.ddns.ff.utilities.entities.CounterData;
import net.ukrtel.ddns.ff.utilities.repositories.CounterDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterDataService {
    private CounterDataRepository repository;

    @Autowired
    public CounterDataService(CounterDataRepository repository) {
        this.repository = repository;
    }

    public CounterData save(CounterData data) {
        return repository.save(data);
    }
}
