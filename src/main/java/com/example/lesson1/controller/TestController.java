package com.example.lesson1.controller;

import com.example.lesson1.dto.HumanDto;
import com.example.lesson1.dto.HumanUpgreid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class TestController {

    @GetMapping("/start_page")
    public String metodFirst() {
        return "Это стартовая страница";
    }

    @GetMapping("/hello")
    public String metodF(@RequestParam String name, Integer age) {
        return "Привет " + name + " " + "возраст  " + age;
    }

    @GetMapping("/hello/{name}")
    public String metodLast(@PathVariable String name) {
        return "Привет " + name;
    }

    @PostMapping("/hello_object")
    public @ResponseBody HumanUpgreid metodObject(@RequestBody HumanDto humanDto) {
        HumanUpgreid humanUpgreid = new HumanUpgreid();
        humanUpgreid.setName(humanDto.getName());
        humanUpgreid.setAge(humanDto.getAge());
        humanUpgreid.setCardNumb(String.valueOf(Math.random()));
        return humanUpgreid;
    }
}
