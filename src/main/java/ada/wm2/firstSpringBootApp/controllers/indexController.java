package ada.wm2.firstSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
    @GetMapping("/login")
    public String login(Model model, @RequestParam("login") String login, @RequestParam("psw") String password ) {
        model.addAttribute("message", "Welcome to the hub, dearest");
        return "index";
    }
        @GetMapping("/")
        public String index(){
            return "login";

    }

}
