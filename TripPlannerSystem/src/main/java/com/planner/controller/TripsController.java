package com.planner.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.planner.service.TripsService;
import com.planner.model.Trips;
import com.planner.model.Cplanner;
import com.planner.service.PlanService;

@Controller
public class TripsController {
	
	@Autowired
	Trips trips;
	
	@Autowired
	TripsService tripsService;
	
	@Autowired
	Cplanner Cplanner;
	
	@Autowired
	PlanService planService;
	
	String msg,msg2;
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("cplanner", Cplanner);
		return "index";
	}
	/*@RequestMapping("Login")
	public String home(Model model) {
		model.addAttribute("trips", trips);
		model.addAttribute("msg", msg);
		return "Search";
	}*/
	
	@RequestMapping("validatePlan")
	public ModelAndView validatePlan(@ModelAttribute("Cplanner") Cplanner cplanner,  ModelAndView mv2) {
		
		Cplanner cplanner2 = planService.validatePlan(cplanner);
		if(cplanner2!=null) {
			
			System.out.println("Login Successfull");
			mv2.addObject("cplanner", cplanner2);
			mv2.setViewName("home");
			return mv2;
			
		}else {
			System.out.println("Login Failed");
		
			mv2.addObject("cplanner", cplanner2);
			mv2.setViewName("redirect:/");
			return mv2;
		}
		
	}
	@RequestMapping("/addplan")
	public String showaddplan(Model model) {
		model.addAttribute("cplanner", Cplanner);
		return "addpaln";
	}
	@RequestMapping("/regplan")
	public ModelAndView savePlan(@ModelAttribute("cplanner") Cplanner Cplanner, ModelAndView mv) throws IOException {
		
		System.out.println("In Save User");
		planService.addPlan(Cplanner);
		mv.addObject("msg", "Planner is Added Successfully");
		//mv.addObject("user", user);
		mv.setViewName("index");
		return mv;
	}

	
	@RequestMapping("/SecPage")
	public String home() {
		return "home";
	}
	@RequestMapping("Search")
	public String home(Model model) {
		model.addAttribute("trips", trips);
		model.addAttribute("msg", msg);
		return "Search";
	}
	
	@RequestMapping("validate")
	public ModelAndView validateTrips(@ModelAttribute("trips") Trips trips,  ModelAndView mv2) {
		
		Trips user1 = tripsService.validateTrips(trips);
		if(user1!=null) {
			
			System.out.println("Login Successfull");
			msg = "Trip is Available";
			Trips trips1 = tripsService.validateTrips(trips);
			mv2.addObject("trips", trips1);
			mv2.setViewName("showtrips");
			return mv2;
			
		}else {
			System.out.println("Login Failed");
			msg = "Sorry, Trip is not Available";
			Trips trips1 = null;
			mv2.addObject("trips", trips1);
			mv2.setViewName("redirect:/Search");
			return mv2;
		}
		
	}

	@RequestMapping("/registeration")
	public String showRegisterationForm(Model model) {
		model.addAttribute("trips", trips);
		return "registeration";
	}
	
	@RequestMapping("submitform")
	public ModelAndView saveUser(@ModelAttribute("trips") Trips trips, ModelAndView mv, @RequestParam("pic") MultipartFile file) throws IOException {
		
		System.out.println("In Save User");
		byte[] ticket = file.getBytes();
		trips.setTicket(ticket);
		tripsService.addTrips(trips);
		mv.addObject("msg", "Trip is Added Successfully");
		//mv.addObject("user", user);
		mv.setViewName("registeration");
		return mv;
	}
	
	@RequestMapping("getall")
	public ModelAndView getAllTrips(ModelAndView mv) {
		List<Trips> tripsList = tripsService.getAllTrips();
		mv.addObject("trips", tripsList);
		mv.addObject("msg", msg);
		mv.setViewName("viewtrips");
		return mv;
	}
	
	@RequestMapping("gettripsform")
	public String gettripsForm() {
		return "gettrips";
	}
	
	@RequestMapping("getbyid")
	public ModelAndView getById(@RequestParam("tripId") int tripId, ModelAndView mv) {
		Trips trips = tripsService.getTripsById(tripId);
		mv.addObject("trips", trips);
		mv.setViewName("showtrips");
		return mv;
	}
	
	@RequestMapping("updatetrips/{tripId}")
	public String getUpdateTrps(@PathVariable int tripId, Model m) {
		
		Trips trips = tripsService.getTripsById(tripId);
		System.out.println("In Controller : "+trips);
		m.addAttribute("trips", trips);
		return "updateform";
		
	}
	
	@RequestMapping("saveupdate")
	public String saveUpdate(@ModelAttribute("trips") Trips trips, ModelAndView mv, @RequestParam("pic") MultipartFile file) throws IOException {
		byte[] ticket = file.getBytes();
		trips.setTicketPic(ticket);
		tripsService.updateTrips(trips);
		return "redirect:/getall";
	}
	
	@RequestMapping("deletetrips/{tripId}")
	public String deleteUser(@PathVariable int tripId) {
		tripsService.deleteTrips(tripId);
		return "redirect:/getall";
	}
}
