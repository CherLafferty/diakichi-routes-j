package com.cher.daikichiroutesj.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {
	@RequestMapping("")
		public String daikichi() {
			return "<h1>Welcome!</h1>";
	}
	
	@RequestMapping("/today")
		public String today() {
			return "<h1>Today you will find luck in all your eandeavors.<h1/>";
	}
	
	@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "<h1>Tomorrow an opportunity will arise, so be sure to be open to new ideas. <h1/>";
	}
	
	@RequestMapping("/travel/{city}")
		public String showCity(@PathVariable("city") String city) {
			return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@RequestMapping("/lotto/{num}")
		public String lotto(@PathVariable("num") Integer num) {
			if(num % 2 == 0 ) {
				return "You will take a grand journey in the near future, but be wary of tempting offers.";
			}else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend tiem with family and friends.";
			}
	}
	
}
