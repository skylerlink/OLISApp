package com.skylerlink.OLISApp.controller;

import com.skylerlink.OLISApp.entity.Person;
import com.skylerlink.OLISApp.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String showForm(Person person) {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid Person person, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        personService.save(person);
        model.addAttribute("person", person);
        model.addAttribute("allPeople", personService.getAll());
        return "confirmation";
    }

    @GetMapping("/submit")
    public String showConfirmation(Model model) {
        model.addAttribute("allPeople", personService.getAll());
        return "confirmation";
    }
}
