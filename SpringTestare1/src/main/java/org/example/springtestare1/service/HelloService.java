package org.example.springtestare1.service;

import org.example.springtestare1.model.HelloModel;
import org.example.springtestare1.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    private final HelloRepository repository;

    @Autowired
    public HelloService(HelloRepository repository) {
        this.repository = repository;
    }

    public List<HelloModel> getAll() {
        return repository.findAll();
    }

    public HelloModel add(String name) {
        return repository.save(new HelloModel(null, name));
    }
}
