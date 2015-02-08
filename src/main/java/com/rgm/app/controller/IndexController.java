package com.rgm.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rmills
 */
@Controller
public class IndexController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
}