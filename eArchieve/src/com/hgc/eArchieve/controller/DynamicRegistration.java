package com.hgc.eArchieve.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicRegistration {

	public static void main(String[] args) {
		DynamicRegistration tmp = new DynamicRegistration();
		tmp.a = "ASASA";
		System.out.println(tmp.a);
	}

	String	a;

	@Produces
	public DynamicRegistration getNewDynamicRegistration() {
		System.out.println("Produce");
		return new DynamicRegistration();
	}
}
