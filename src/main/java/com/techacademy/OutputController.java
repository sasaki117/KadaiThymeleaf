package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("inputValue") String inputValue,
                             @RequestParam(value = "previous", required = false) String previous,
                             Model model) {
        model.addAttribute("inputValue", inputValue);
        model.addAttribute("previous", previous);
        return "output";
    }
}
