package ru.aclij.webacl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
    @GetMapping("/chess")
    public String chess(){
        return "/pages/chess";
    }
    @GetMapping("/chessmap")
    public String chessmap(){
        return "/test/board";
    }

}
