package com.learn.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.model.Inventory;
import com.learn.service.InventoryService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private InventoryService inventoryService;
	
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
	public String processForm(@Valid @ModelAttribute("register") Inventory theInventory,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "register-form";
		}
		else {
			inventoryService.saveInventory(theInventory);
		return "homePageInventory";
		}
	}
	
}
