package com.academy_DAAG.epw.service;

import com.academy_DAAG.epw.dto.CourseRequest;
import com.academy_DAAG.epw.dto.CourseResponse;

import java.util.List;

public interface CourseService {

    CourseResponse createCourse(CourseRequest request);

    List<CourseResponse> getAllCourses();
}
