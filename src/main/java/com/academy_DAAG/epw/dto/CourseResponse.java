package com.academy_DAAG.epw.dto;

public class CourseResponse {

    private Long id;
    private String name;
    private int credits;

    public CourseResponse() {
    }

    public CourseResponse(Long id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
}
