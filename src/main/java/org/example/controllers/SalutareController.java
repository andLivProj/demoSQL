package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutareController {

    @GetMapping("/salut")
    public String salutare() {
        return "salutare";
    }
}
