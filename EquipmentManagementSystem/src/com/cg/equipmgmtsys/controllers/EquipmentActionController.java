package com.cg.equipmgmtsys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.eqipmgmtsys.beans.Equipment;
import com.cg.eqipmgmtsys.services.EquipmentService;

@Controller
public class EquipmentActionController {
	/*@Autowired
	EquipmentService equipmentService;*/
@RequestMapping(value="/loginAction")
public ModelAndView login(@ModelAttribute("equipment")Equipment equipment,@RequestParam("user_id.authorization")boolean value){
	if(value==true)
	return new ModelAndView("admin","equipment",equipment);
	else
		return new ModelAndView("welcome","equipment",equipment);
}
}
