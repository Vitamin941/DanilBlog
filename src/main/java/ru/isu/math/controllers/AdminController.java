package ru.isu.math.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.isu.math.model.Article;
import ru.isu.math.repository.ArticleRepository;

@Controller
@RequestMapping("/admin")

public class AdminController {

    ArticleRepository repository;

    @Autowired
    AdminController (ArticleRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String loadAdmin(ModelMap model) {
        Article art = new Article();
        art.setActive(false);
        art.setDescription("This is a description");
        art.setTitle("MyTitle");
        repository.save(art);
        model.addAttribute("articles",art);
        return "admin";
    }
}
