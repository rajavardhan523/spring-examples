package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String handleRequest() {
		System.out.println("Request handled");
		return "welcome";
	}

	/*@RequestMapping(value = "/hellowithtext/{sampleValue}", method = RequestMethod.GET)
	public String handleRequestWithParams(@PathVariable String text, Model model) {
		System.out.println("Request handled with params");
		model.addAttribute("sampleName", text);
		return "welcome";
	}*/

}
