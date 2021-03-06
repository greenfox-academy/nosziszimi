package com.greenfox.controller;

import com.greenfox.model.Todo;
import com.greenfox.repository.Repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Nóra on 2017. 05. 09..
 */
@Controller
@RequestMapping("/todo")
public class TodoController {
  @Autowired
  private Repository repo;

  @RequestMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repo.findAll());
    return "todo";
  }
}
