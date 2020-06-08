package git_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {
	public String main(Model model) {
		model.addAttribute("title", "메롱");
		return "index";
	}
}
