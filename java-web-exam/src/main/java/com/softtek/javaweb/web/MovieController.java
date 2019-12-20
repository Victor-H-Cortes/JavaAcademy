package com.softtek.javaweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.javaweb.service.MovieService;

@Controller
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieService movieService;
	
	@GetMapping("/list")
	public String getNationalityList(Model model) {
		model.addAttribute("movies", movieService.list());
		return "movie/list"; 		
	}

	@PostMapping(value = "/edit", params = "home")
	public String goHome(Model model, @RequestParam ("home") String home) {
		return "redirect:/"; 		
	}
	
}
