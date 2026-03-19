package org.example.springtestare1.model;

public class HelloModel {
    private Long id;
    private String name;

    public HelloModel(){

    }

    public HelloModel(Long id, String name){
        this.id = id;
        this.name = name;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
