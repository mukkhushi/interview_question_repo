package com.crud.test.dto;

public class EmployeeDto {
    private Long id;
    private String name;
    private String stream;

    public EmployeeDto(Long id, String name, String stream) {
        this.id = id;
        this.name = name;
        this.stream = stream;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
