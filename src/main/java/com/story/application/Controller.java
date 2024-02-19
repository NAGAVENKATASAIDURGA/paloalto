package com.story.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/palo")
public class Controller {
@GetMapping("/test")
public String story() {
	Logger logger=LoggerFactory.getLogger(Controller.class);
	logger.info("I am sample piece of code");
	return "Hello world";
}
}
