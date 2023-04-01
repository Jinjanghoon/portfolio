package com.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

  @GetMapping("test")
  public String Test() {

    return "test";
  }
}
