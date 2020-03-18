package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/")
public class DemoController
{
    @GetMapping
    public String welcome() {
        return "welcome to spring boot open shift demo";
    }
    
    private static final String RESOURCE_URL = "https://cricapi.com/api/playerStats?apikey=7dvscmeOeyPCBVjGXle3iV2Gob43&pid=35320";
    private RestTemplate restTemplate;

    @Autowired
    public DemoController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/user")
    public String getUser(Model model) throws JsonMappingException, JsonProcessingException{
    	
    	ResponseEntity<String> requestContent = restTemplate.getForEntity(RESOURCE_URL, String.class);
    	System.out.println(requestContent);
    	ObjectMapper mapper = new ObjectMapper();
    	User user = mapper.readValue(requestContent.getBody(), User.class);
	    System.out.println(user);
		model.addAttribute("user", user);
		return "user-detail";
    }
}