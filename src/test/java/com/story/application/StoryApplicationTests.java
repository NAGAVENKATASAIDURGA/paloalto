package com.story.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StoryApplicationTests {
@Autowired
private Controller controller;
	@Test
	void contextLoads() {
	}
	@Test
	public void Story() {
		String story=controller.story();
		assertEquals("Hello world", story);
	}

}
