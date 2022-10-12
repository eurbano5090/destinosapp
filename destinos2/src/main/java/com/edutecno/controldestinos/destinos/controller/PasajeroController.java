package com.edutecno.controldestinos.destinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.edutecno.controldestinos.destinos.modelo.Pasajero;
import com.edutecno.controldestinos.destinos.service.DestinoService;
import com.edutecno.controldestinos.destinos.service.PasajeroService;



@Controller
@RequestMapping("pasajeros")
public class PasajeroController {
	//controlador -> servicio -> repository----> BD
	
	@Autowired
	private PasajeroService pasajeroService;

	@Autowired
	private DestinoService destinoService;
	
	
	@GetMapping("/crear")
	public ModelAndView crear() {
		ModelAndView modelAndView = new ModelAndView("crear-pasajero");
		modelAndView.addObject("pasajero", new Pasajero());
	
		return modelAndView;
	}
	
	@PostMapping("/agregar")
	public RedirectView crear(@ModelAttribute Pasajero pasajero) {
		pasajeroService.save(pasajero);
		return new RedirectView("/pasajeros");
	}
	
	@GetMapping
	public ModelAndView pasajeros(Model model) {
		ModelAndView modelAndView = new ModelAndView("pasajeros");
		modelAndView.addObject("pasajero", pasajeroService.findAll().getPasajeros());
		model.addAttribute("destino", destinoService.getClass());
		
		return modelAndView;
	}
	
}

