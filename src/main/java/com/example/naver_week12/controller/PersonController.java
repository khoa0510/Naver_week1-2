package com.example.naver_week12.controller;

import com.example.naver_week12.model.Person;
import com.example.naver_week12.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {
    private List<Person> persons;

    private PersonService personService;

    PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/")
    public String PersonList(Model model) {
        persons=personService.getPersonList();
        model.addAttribute("persons", persons);
        return "personList";
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public Person PersonById(@PathVariable("id") String Id) {
        Person person = personService.getPersonById(Id);
        return person;
    }
}
