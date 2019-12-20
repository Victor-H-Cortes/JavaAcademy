package com.softtek.javaweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.javaweb.domain.model.Nationality;
import com.softtek.javaweb.service.NationalityService;

@Controller
@RequestMapping("/nationality")
public class NationalityController {
	@Autowired
	NationalityService nationalityService;
	
	@GetMapping("/list")
	public String getNationalityList(Model model) {
		model.addAttribute("nationalities", nationalityService.list());
		return "nationality/list"; 		
	}

	@PostMapping(value = "/edit", params = "home")
	public String goHome(Model model, @RequestParam ("home") String home) {
		return "redirect:/"; 		
	}
	
	@PostMapping(value = "/edit", params = "addNew")
	public String addNationality(Model model, @RequestParam ("addNew") String home) {
		model.addAttribute("headerTitle", "Add New Nationality");
		model.addAttribute("frmLblSubmitBtn", "Save");
		return "nationality/edit"; 		
	}

	@GetMapping(value = "/edit", params = {"showDetail", "id"})
	public String showNationality(Model model, @RequestParam ("showDetail") String home, @RequestParam ("id") String id) {
		Nationality nationality = nationalityService.getOne(id); 
		model.addAttribute("headerTitle", "Edit Nationality");
		model.addAttribute("frmLblSubmitBtn", "Update");
		model.addAttribute("nationality", nationality);
		return "nationality/edit"; 		
	}

	@PostMapping(value = "/edit", params = "Save")
	public String saveNationality(@ModelAttribute Nationality nationality, BindingResult br, Model model, @RequestParam ("Save") String home) {
		nationalityService.add(nationality);
		return "redirect:/nationality/list"; 		
	}

	@PostMapping(value = "/edit", params = "Update")
	public String updateNationality(@ModelAttribute Nationality nationality, Model model, @RequestParam ("Update") String update) {
		nationalityService.update(nationality);
		return "redirect:/nationality/list"; 		
	}

	@PostMapping(value = "/edit", params = "delete")
	public String deletewNationality(@ModelAttribute Nationality nationality, Model model, @RequestParam ("delete") String update) {
		nationalityService.delete(nationality.getNationalityId());
		return "redirect:/nationality/list"; 		
	}

	@PostMapping(value = "/edit", params = "cancel")
	public String cancelEdit(Model model, @RequestParam ("cancel") String home) {
		return "redirect:/nationality/list"; 		
	}

}
