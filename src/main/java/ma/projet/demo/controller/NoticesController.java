package ma.projet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticesController {
	
	@GetMapping("/notices")
	public String showNoticesPage(String input) {
		return "notices";
	}

}
