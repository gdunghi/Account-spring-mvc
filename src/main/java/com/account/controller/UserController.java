package com.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.account.UserServiceImpl;
import com.account.dto.UserDto;

@Controller
@RequestMapping("/user")
public class UserController {
	private UserServiceImpl service = new UserServiceImpl();
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "user/add";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("user") UserDto user) { 
		service.save(user);
		return "redirect:/user/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model) {	
		model.addAttribute("userList", service.getAllBy());
		return "user/list";
	}

}
