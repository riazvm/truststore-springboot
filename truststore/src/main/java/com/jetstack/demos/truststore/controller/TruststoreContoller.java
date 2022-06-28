package com.jetstack.demos.truststore.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jetstack.demos.truststore.model.Greeting;

@RestController
public class TruststoreContoller {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	  @GetMapping("/trust")
	  @ResponseBody
	  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
	    return new Greeting(counter.incrementAndGet(), String.format(template, name));
	  }
}
