package com.course.Mr_Science.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.course.Mr_Science.Model.Test;
import com.course.Mr_Science.Service.FilterService;
import com.course.Mr_Science.repository.TestRepository;

@Controller
public class FilterController {
	
	
	
	@Autowired
	private TestRepository testRepository;
	
	
	@Autowired
	private FilterService filterService;
	

	@RequestMapping("/allTest")
	public String alltest() {
		
		return "allTest";
	}


	
	
	@RequestMapping("/901")
	public String ninegen(Model model) {
		
		List<Test> filterTest = testRepository.findAll();
		
		List<Test> selectTest = filterService.filterTest(901, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	

	@RequestMapping("/902")
	public String nineeng(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(902, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/903")
	public String ninemat(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(903, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/904")
	public String ninesci(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(904, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/905")
	public String ninesoc(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(905, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	
	
	
	
	
	@RequestMapping("/1001")
	public String tengen(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1001, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	@RequestMapping("/1002")
	public String teneng(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1002, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1003")
	public String tenmat(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1003, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1004")
	public String tensci(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1004, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1005")
	public String tensoc(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1005, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	
	
	
	
	
	@RequestMapping("/1101")
	public String elgen(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1101, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	@RequestMapping("/1102")
	public String elphy(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1102, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1103")
	public String elchem(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1103, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1104")
	public String elbio(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1104, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1105")
	public String elbot(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1105, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1106")
	public String elzoo(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1106, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	@RequestMapping("/1107")
	public String elcom(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1107, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1108")
	public String elacc(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1108, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1109")
	public String elbm(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1109, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1110")
	public String elca(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1110, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	
	// =======================================
	//==========================================
	
	@RequestMapping("/1201")
	public String tlgen(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1201, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	@RequestMapping("/1202")
	public String tlphy(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1202, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1203")
	public String tlchem(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1203, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1204")
	public String tlbio(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1204, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1205")
	public String tlbot(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1205, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1206")
	public String tlzoo(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1206, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	@RequestMapping("/1207")
	public String tlcom(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1207, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1208")
	public String tlacc(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1208, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1209")
	public String tlbm(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1209, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	@RequestMapping("/1210")
	public String tlca(Model model) {
		List<Test> filterTest = testRepository.findAll();
		List<Test> selectTest = filterService.filterTest(1210, filterTest);
		 model.addAttribute("sl",selectTest);
		return "filterTestList";
	}
	
	
	

}
