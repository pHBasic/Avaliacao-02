package com.ph.calculadoraimc.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ph.calculadoraimc.model.Imc;

@RestController
@RequestMapping("/controller")
public class Imccontroller {

	@GetMapping
	public ResponseEntity<String> CalcularIMC(@RequestBody Imc imc) {
		imc.setIMC(imc.getuserWeight(), imc.getuserHeight());
		return ResponseEntity.ok(imc.getprintIMC());
	}

	
}
