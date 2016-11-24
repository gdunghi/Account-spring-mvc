package com.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.account.DBUtils;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("/")
	public String index() {
		DBUtils db = new DBUtils();
		db.testConnection();
		return "index";
	}
 
}
