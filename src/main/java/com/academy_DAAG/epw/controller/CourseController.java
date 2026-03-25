package com.academy_DAAG.epw.controller;

import com.academy_DAAG.epw.dto.CourseRequest;
import com.academy_DAAG.epw.dto.CourseResponse;
import com.academy_DAAG.epw.service.CourseService;


import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    // POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CourseResponse createCourse(
            @Valid @RequestBody CourseRequest request
    ) {
        return service.createCourse(request);
    }

    // GET
    @GetMapping
    public List<CourseResponse> getAllCourses() {
        return service.getAllCourses();
    }
}
