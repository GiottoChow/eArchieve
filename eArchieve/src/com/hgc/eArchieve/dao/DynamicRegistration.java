package com.hgc.eArchieve.dao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.hgc.eArchieve.dao.JsonHeader;

@RestController
public class DynamicRegistration {

	// Delete with condition object
	@RequestMapping("/service/(*:objectType)/invalidate")
	public JsonHeader invalidate(@RequestParam(value = "objectType") String objectType,
			@RequestParam(value = "condition") String jsonString) {
		try {
			Gson gson = new Gson();
			JsonHeader header = gson.fromJson(jsonString, JsonHeader.class);
			Object tmp = null;

			if (header.getReturnCode() == -1) {
				throw new JsonParseException(header.getResultContent().toString());
			}
			tmp = gson.fromJson(header.getResultContent().toString(), Class.forName(objectType));
		} catch (Exception ex) { // ClassNotFoundException
			String errMsg = ex.getMessage();
			for (StackTraceElement ste : ex.getStackTrace()) {
				errMsg += "\n" + ste.toString();
			}
			return JsonHeader.errHeader(errMsg);
		}

		return tmp;
	}

	// Insert & Update
	@RequestMapping("/service/(*:objectType)/validate")
	public JsonHeader[] validate(@RequestParam(value = "objectType") String objectType,
			@RequestParam(value = "content") String jsonString) {
		return null;
	}
}
