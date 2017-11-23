package com.banctec.onlineclaim.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        
    	System.out.println("ss");
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
        
    }
    
    
    @RequestMapping(value="/greeting1", produces = MediaType.TEXT_HTML_VALUE)
    public String greet() {
        
    	System.out.println("ss");
    	return "HELLO.. !";
        
    }

}
