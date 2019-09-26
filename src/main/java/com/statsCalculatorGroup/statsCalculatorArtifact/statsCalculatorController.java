package com.statsCalculatorGroup.statsCalculatorArtifact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class statsCalculatorController {
	
	//Method for url/endpoint
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	
}
