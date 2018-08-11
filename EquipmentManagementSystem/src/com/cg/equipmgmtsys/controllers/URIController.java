package com.cg.equipmgmtsys.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.eqipmgmtsys.beans.Equipment;

@Controller
public class URIController {
	@RequestMapping(value="/")
	public String getHomePage() {
		return "home";
	}
	@RequestMapping(value="/login")
	public String getLoginPage() {
		return "login";
	}
	@ModelAttribute("equipment")
	public Equipment getEquipment() {
		return new Equipment();
	}
}