package com.ua.geography.service;

import com.ua.geography.domain.Country;
import com.ua.geography.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CountriesService {
    private final CountryRepository countryRepository;

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public Optional<Country> findById (Long id) {
        return countryRepository.findById(id);
    }

    public void save (Country countries){
        countryRepository.save(countries);
    }




}
