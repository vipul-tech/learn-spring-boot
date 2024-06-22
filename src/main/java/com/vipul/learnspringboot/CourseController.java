package com.vipul.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn Spring", "CodingWorld"),
				new Course(2, "Learn AWS", "CodingWorld"),
				new Course(3, "Learn Microservices", "CodingWorld"),
				new Course(4, "Learn Microsoft Azure", "CodingWorld"),
				new Course(5, "Learn Python", "CodingWorld")
				);
	}

}
