package com.spti.helloworld1.controller;
import com.spti.helloworld1.entity.Person;
import com.spti.helloworld1.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class PersonsController {
	private final PersonService personService;
	public PersonsController(PersonService personService) {
		this.personService = personService;
	}
	@GetMapping("/persons/")
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				                DateFormat.LONG, locale);
		String serverTime = dateFormat.format(date);
		model.addAttribute("serverTime", serverTime.toString() );
		List<Person> personList = personService.getAllPersons();
		model.addAttribute("personList", personList );
		return "persons";
	}
}

