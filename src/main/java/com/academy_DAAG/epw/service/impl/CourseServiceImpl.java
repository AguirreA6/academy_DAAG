package com.academy_DAAG.epw.service.impl;

import com.academy_DAAG.epw.dto.CourseRequest;
import com.academy_DAAG.epw.dto.CourseResponse;
import com.academy_DAAG.epw.entity.course;
import com.academy_DAAG.epw.repository.CourseRepository;
import com.academy_DAAG.epw.service.CourseService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public CourseResponse createCourse(CourseRequest request) {

        course course = new course();
        course.setName(request.getName());
        course.setCredits(request.getCredits());

        course saved = repository.save(course);

        return new CourseResponse(
                saved.getId(),
                saved.getName(),
                saved.getCredits()
        );
    }

    @Override
    public List<CourseResponse> getAllCourses() {

        return repository.findAll()
                .stream()
                .map(c -> new CourseResponse(
                        c.getId(),
                        c.getName(),
                        c.getCredits()
                ))
                .collect(Collectors.toList());
    }
}
