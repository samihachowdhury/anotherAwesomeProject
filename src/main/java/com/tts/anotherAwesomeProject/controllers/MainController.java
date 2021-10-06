package com.tts.anotherAwesomeProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class MainController {

        @RequestMapping("/")
        public String home() {
            return "Hello World!";
        }

        @RequestMapping("/showMe")
        public String showMe() {
            return "oranges.html";
        }
    }
