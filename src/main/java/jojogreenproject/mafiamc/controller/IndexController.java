package jojogreenproject.mafiamc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("setting")
	public String setting() {
		return "setting";
	}
}
