package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TestSB")
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message}")
	private String message = "Hello World";
	
	@Value("${reno.test}")
	private String muesta = "Mensaje por Modelo propio";

	@RequestMapping("/bienvenido")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/xxx")
	public String bad(Map<String, Object> model){
		model.put("hola", this.muesta);
		return "bad";
	}
	
	@RequestMapping("/yy")
	public String yy(){
		return "inicioSP/walk";
	}
}