package com.story.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palo")
public class Controller {
@GetMapping("/alto")
public String story() {
	return "palo alto testing";
}
}
