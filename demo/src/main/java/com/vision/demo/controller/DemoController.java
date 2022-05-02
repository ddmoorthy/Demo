package com.vision.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vision.demo.service.DemoService;

@RestControllerAdvice
@RequestMapping(path="controller")
public class DemoController {

	@Autowired
	DemoService demoService;
	
	@RequestMapping(path="/method", method = RequestMethod.GET)
	public String call() {
		int returnStatus = demoService.serviceCall();
		return "call-"+returnStatus;
	}
	
}
