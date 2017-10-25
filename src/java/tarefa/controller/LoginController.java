/*
 * Pau no cu do matheus
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tarefa.dao.UsuarioDao;
import tarefa.model.Usuario;

/**
 *
 * @author Alcides Lemos
 */
@Controller
public class LoginController{
    @RequestMapping("loginForm")
    public String loginForm() {
        return "loginForm";
    }
    
    @RequestMapping("efetuaLogin")
    public String efetuaLogin(Usuario user, HttpSession session) {
        if(new UsuarioDao().existeUsuario(user)) {
            session.setAttribute("usuarioLogado", user);
            return "redirect:cart";
        }
        return "redirect:loginForm";
    }
    
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

  @RequestMapping("fLogin")
  public String formLogin() {
      return "loginForm";
  }
}

