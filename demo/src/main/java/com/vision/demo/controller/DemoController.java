package com.vision.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(path="controller")
public class DemoController {

	@RequestMapping(path="/method", method = RequestMethod.GET)
	public String call() {
		return "call";
	}
	
}
