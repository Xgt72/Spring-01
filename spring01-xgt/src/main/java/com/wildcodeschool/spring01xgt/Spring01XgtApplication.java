package com.wildcodeschool.spring01xgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Spring01XgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring01XgtApplication.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String firstDoctor() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/6")
	@ResponseBody
	public String sixthDoctor() {
		return "Colin Baker";
	}

	@RequestMapping("/doctor/9")
	@ResponseBody
	public String ninthDoctor() {
		return "Christopher Eccleston";
	}

	@RequestMapping("/doctor/11")
	@ResponseBody
	public String eleventhDoctor() {
		return "Matt Smith";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>Some Doctors from Doctor Who:" +
				"<li><a href='/doctor/1'>The first Doctor</a></li>" +
				"<li><a href='/doctor/6'>The sixth Doctor</a></li>" +
				"<li><a href='/doctor/9'>The ninth Doctor</a></li>" +
				"<li><a href='/doctor/11'>The eleventh Doctor</a></li>" +
				"</ul>";
	}

}
