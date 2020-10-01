package com.example.oauth2AuthorizationServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
class UserInfoController {

	@Autowired
	private ObjectMapper objectMapper;
	
    @GetMapping(value="/userInfo",produces="application/json")
    public String userInfo() throws JsonProcessingException{
    	
    	User user  = new User("a","b","c");
    	
        return objectMapper.writeValueAsString(user);
    }
}

