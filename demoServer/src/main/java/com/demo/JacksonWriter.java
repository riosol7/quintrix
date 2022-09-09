package com.demo;

import java.io.File;
import java.io.IOException;

import com.demo.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ObjectMapper mapper = new ObjectMapper();

		// Java object to JSON file
		try {
			mapper.writeValue(new File("test"), new Employee("Pirai"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Java object to JSON string
		try {
			String jsonString = mapper.writeValueAsString(new Employee("Pirai"));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
