package com.kodz.actuatorgo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jakisendpoint")
public class JakisEndpoint {
    @GetMapping("/")
    public String odpowiedz(){
        return "odpowiedz";
    }

}
