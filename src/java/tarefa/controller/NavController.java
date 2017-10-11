/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alcides Lemos
 */
@Controller
public class NavController {

    /*@RequestMapping("/")
    public String execute() {
        return "vend/index";
    }*/

  @RequestMapping("fLogin")
  public String formLogin() {
      return "login/loginForm";
  }
}
