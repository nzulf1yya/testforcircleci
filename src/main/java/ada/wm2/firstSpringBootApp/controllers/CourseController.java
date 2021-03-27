package ada.wm2.firstSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/course")

public class CourseController {
    @GetMapping("/list")
    public String list(Model model){
        List courselist = new ArrayList();

        model.addAttribute("courses", courselist);
        return "courses";

    }
}
