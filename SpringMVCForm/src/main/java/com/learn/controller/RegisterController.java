package com.learn.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.model.Inventory;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){//translating input strings
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("register",new Inventory());
		
		return "register-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("register") Inventory register,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "register-form";
		}
		else
		return "homePageInventory";
	}
	
}
