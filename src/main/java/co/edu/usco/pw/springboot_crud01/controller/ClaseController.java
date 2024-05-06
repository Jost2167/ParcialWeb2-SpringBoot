package co.edu.usco.pw.springboot_crud01.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.usco.pw.springboot_crud01.model.Clase;
import co.edu.usco.pw.springboot_crud01.service.IClaseService;

@Controller
public class ClaseController {

	@Autowired
	private IClaseService claseService;

	@RequestMapping(value = "/list-clases", method = RequestMethod.GET)
	public String showClases(ModelMap model) {
		model.put("clases", claseService.getClasesByUser("rector"));
		
		if(getLoggedinUserName()=="rector") {
			return "list-clases";
		}else {
			return "list-clases-docente";
		}
		
	}
	
	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		
		return principal.toString();
	}
	

	@RequestMapping(value = "/add-clase", method = RequestMethod.GET)
	public String showAddClasePage(ModelMap model) {
		model.addAttribute("clase", new Clase());
		return "clase";
	}

	@RequestMapping(value = "/add-clase", method = RequestMethod.POST)
	public String addClase(ModelMap model, @Valid Clase clase, BindingResult result) {

		if (result.hasErrors()) {
			return "clase";
		}

		claseService.saveClase(clase);
		return "redirect:/list-clases";
	}

	@RequestMapping(value = "/delete-clase", method = RequestMethod.GET)
	public String deleteClase(@RequestParam long id) {
		claseService.deleteClase(id);
		// service.deleteTodo(id);
		return "redirect:/list-clases";
	}

	@RequestMapping(value = "/update-clase", method = RequestMethod.GET)
	public String showUpdateClasePage(@RequestParam long id, ModelMap model) {
		Clase clase = claseService.getClaseById(id).get();
		model.put("clase", clase);
		return "clase";
	}

	@RequestMapping(value = "/update-clase", method = RequestMethod.POST)
	public String updateClase(ModelMap model, @Valid Clase clase, BindingResult result) {

		if (result.hasErrors()) {
			return "clase";
		}

		claseService.updateClase(clase);
		return "redirect:/list-clases";
	}

}
