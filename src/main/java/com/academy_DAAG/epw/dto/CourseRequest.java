package com.academy_DAAG.epw.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;

public class CourseRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 1, message = "Credits must be greater than 0")
    private int credits;

    public CourseRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
