package ma.projet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoansController {
	
	@GetMapping("/myLoans")
	public String showMyLoansPage(String input) {
		return "myLoans";
	}

}
