package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = speakerRepository;
    }

    @Override
    public  List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl repository setter");
        this.repository = speakerRepository;
    }
}
