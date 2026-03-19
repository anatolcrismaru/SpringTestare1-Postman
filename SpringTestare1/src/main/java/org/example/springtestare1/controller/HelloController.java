package org.example.springtestare1.controller;

import org.example.springtestare1.model.HelloModel;
import org.example.springtestare1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")  // toate endpoint-urile încep cu /hello
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // GET all
    @GetMapping
    public List<HelloModel> getAll() {
        return helloService.getAll();
    }

    // GET by id
    @GetMapping("/{id}")
    public HelloModel getById(@PathVariable Long id) {
        return helloService.getAll().stream()
                .filter(h -> h.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // POST - adaugă un nou model
    @PostMapping
    public HelloModel add(@RequestParam String name) {
        return helloService.add(name);
    }
}
