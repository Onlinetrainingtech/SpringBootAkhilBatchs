package com.example.SpringDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class HomeController
{
  @RequestMapping(value="/b1")
  public String hello()
  {
	  return "Welcome to the hello Application";
  }
  @RequestMapping(value="/b2")
  public String bye()
  {
	  return "Welcome to the bye function";
  }
}
