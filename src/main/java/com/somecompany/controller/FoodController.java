package com.somecompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodController {

        @RequestMapping(value = "/", method = RequestMethod.GET)
        public ModelAndView allFood() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("food");
            return modelAndView;
        }

        @RequestMapping(value = "/recipes", method = RequestMethod.GET)
        public ModelAndView editPage() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("recipes");
            return modelAndView;
        }
    }

