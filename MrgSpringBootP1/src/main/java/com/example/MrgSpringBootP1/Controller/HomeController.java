package com.example.MrgSpringBootP1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping("/api")
public class HomeController 
{
//    @RequestMapping(value="/")
//    public String hello()
//    {
//    	return "Welcome to the SpringBootApplication";
//    }
	 @GetMapping
	 @RequestMapping("/")
	    public ModelAndView index() {
	       ModelAndView m1=new ModelAndView("index");
	       return m1;
		 // returns the name of the HTML file (index.html)
	    }
}
