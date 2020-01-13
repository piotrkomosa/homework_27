package org.java.jpa_hibernate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("movie", new Movie());
        return "movies";
    }
}
