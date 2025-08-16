package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Student;
import com.example.demo.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String viewHome(Model model) {
		
		model.addAttribute("list",studentService.getAll());
		model.addAttribute("student", new Student());
		return "index";
	}
	
	@PostMapping("/save")
	public String saveCollege(@ModelAttribute Student college) {
		
		studentService.save(college);
		return "redirect:/";
		}
	
	@GetMapping("/edit/{id}")
	public String showEdit(@PathVariable Long id,Model model) {
		
		Student college=studentService.getById(id);
		model.addAttribute("college", college);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateCollege(@ModelAttribute Student college) {
		
		studentService.save(college);
		return "redirect:/"; 
	
		
	}
	@GetMapping("/delete/{id}")
	public String deleteCollege(@PathVariable Long id) {
		
		studentService.delete(id);
		return "redirect:/"; 
	
		
	}
}
	

