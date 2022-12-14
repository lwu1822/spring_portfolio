package com.nighthawk.spring_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller  // HTTP requests are handled as a controller, using the @Controller annotation


public class WordCount {
     // @GetMapping handles GET request for /greet, maps it to greeting() method
     @GetMapping("/wordCount")
     // @RequestParam handles variables binding to frontend, defaults, etc
     public String greeting(@RequestParam(name="word", required=false, defaultValue="test") String word, Model model) {
 
         // model attributes are visible to Thymeleaf when HTML is "pre-processed"
         model.addAttribute("word", word);

         int letterNum = word.length();
         model.addAttribute("letterNum", letterNum);
 
         // load HTML VIEW (greet.html)
         return "wordCount"; 
 
     }
}


