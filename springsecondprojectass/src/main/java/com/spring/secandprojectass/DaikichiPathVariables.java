package com.spring.secandprojectass;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DaikichiPathVariables {
	   @RequestMapping("/daikichi/{str}/{city}")
	    public String showLesson(@PathVariable("str") String str, @PathVariable("city") String module){
	    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	    }
}

