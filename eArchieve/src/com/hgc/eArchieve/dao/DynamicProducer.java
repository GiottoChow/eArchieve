package com.hgc.eArchieve.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hgc.eArchieve.dao.JsonHeader;

@RestController
public class DynamicProducer {

	public static void main(String[] p_strings) {
		new DynamicProducer().test();

	}

	@RequestMapping("/service/(*:objectType)/search")
	public JsonHeader[] search(@RequestParam(value = "objectType", defaultValue = "Object") String objectType) {
		return new JsonHeader[] {};
	}

	public void test() {
		SessionFactory sf = new SessionF
				List<Object> list = session.createQuery("from java.lang.Object").list();
	}
}
