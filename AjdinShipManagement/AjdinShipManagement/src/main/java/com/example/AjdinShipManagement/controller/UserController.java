package com.example.AjdinShipManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/")
  public String Ajdin() {
	  return "index";
  }

	@GetMapping("/about")
	public String Ajdin1() {
		return "about";
	}
	@GetMapping("/Services")
	public String Ajdin3() {
		return "Services";
	}
	@GetMapping("/Careers")
	public String Ajdin4() {
		return"Careers";
	}
	@GetMapping("/Training")
	public String Ajdin5() {
		return"Training";
	}
	@GetMapping("/ManagementTeam")
	public String Ajdin6() {
		return "ManagementTeam";
	}
	@GetMapping("/Vision")
	public String Ajdin7() {
		return "Vision & Mission";
	}
	@GetMapping("/approvals")
	public String Ajdin8() {
		return "approvals";
	}
	@GetMapping("/contact")
	public String Ajdin9() {
		return "contact";
	}
	@GetMapping("/readmore")
	public String Ajdin10() {
		return "about";
	}
}
