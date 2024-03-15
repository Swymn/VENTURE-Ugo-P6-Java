package fr.swynn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        final var view = new ModelAndView("index");
        view.addObject("message", "Je t'aime, mon amour!");
        return view;
    }
}
