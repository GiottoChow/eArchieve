package com.hgc.eArchieve.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/testHash")
	public HashMap<String, String> testHash(@RequestParam(value = "name", defaultValue = "World") String name) {
		HashMap<String, String> tmp = new HashMap<String, String>();
		tmp.put("ABC123", "12312312");
		return tmp;
	}

	@RequestMapping("/testObj")
	public Object testObj(@RequestParam(value = "name", defaultValue = "World") String name) {
		TestObj obj = new TestObj();
		obj.a = "ASAS";
		obj.b = "ASASASASA";
		return obj;
	}
}

class TestObj {
	String	a;
	String	b;
}