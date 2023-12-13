package org.perscholas.springboot.controller;


import org.perscholas.springboot.database.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SlashController {

    // @GetMapping{("/index,"/""})
    // @GetMapping("/index")
    @GetMapping(value = {"/index", "/"})
    public ModelAndView index() {
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView response = new ModelAndView("about");
        return response;
    }

    @GetMapping("/page")
    public ModelAndView page() {
        ModelAndView response = new ModelAndView("page");
        return response;

    }
}

