package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.Model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Controller
public class UserController {

    @GetMapping("/")
    public String printWelcome(Model model) {
        List<User> catList = new ArrayList<>();
        Collections.addAll(catList, new User("Zohar", 21, "E60@mail.ru"),
                new User("Sergey", 24, "Impala@mail.ru"),
                new User("Vania", 31, "Patriot@mail.ru"),
                new User("Misha", 13, "Logan@mail.ru"),
                new User("Peta", 41, "Lancer@mail.ru"));
        model.addAttribute("users", catList);
        return "users";
    }
}
