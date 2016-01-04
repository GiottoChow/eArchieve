package com.hgc.eArchieve.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hgc.eArchieve.dao.JsonHeader;

@RestController
public class DynamicRepository {

	@RequestMapping("/service/(*:objectType)/search")
	public JsonHeader[] search(@RequestParam(value = "objectType", defaultValue = "Object") String objectType) {
		return new JsonHeader[] {};
	}
}
