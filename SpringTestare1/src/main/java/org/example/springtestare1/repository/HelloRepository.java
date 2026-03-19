package org.example.springtestare1.repository;

import org.example.springtestare1.model.HelloModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HelloRepository {
    private final List<HelloModel> items = new ArrayList<>();
    private Long nextId = 1L;

    public List<HelloModel> findAll() {
        return items;
    }

    public HelloModel save(HelloModel model) {
        model.setId(nextId++);
        items.add(model);
        return model;
    }

    public Optional<HelloModel> findById(Long id) {
        return items.stream().filter(m -> m.getId().equals(id)).findFirst();
    }
}
