package com.dil.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {

	@RequestMapping(value = "/studentForm", method = RequestMethod.GET)
	public ModelAndView student() {
		// Passes the new Student() model to the student view, Note that command
		// was needed since it is a form
		return new ModelAndView("studentForm", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({ StudentExceptionHandler.class })
	public String addStudent(
			@ModelAttribute("myStudentModelFromForm") Student student,
			ModelMap model) {

		if (student.getName().length() < 5) {
			throw new StudentExceptionHandler(
					"Given Name is smaller than 5 characters, please use a longer name");
		} else {
			model.addAttribute("name", student.getName());
		}

		if (student.getAge() == null || student.getAge() < 10) {

			throw new StudentExceptionHandler(
					"Given Age is smaller than 10, use a greater age value");
		} else {
			model.addAttribute("age", student.getAge());
		}

		model.addAttribute("id", student.getId());

		return "showStudentDetails";
	}
}