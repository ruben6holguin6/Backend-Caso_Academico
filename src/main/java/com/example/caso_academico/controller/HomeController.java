package com.example.caso_academico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping
	public String home() {
		return "Bienvenido a Spring";
	}
}
