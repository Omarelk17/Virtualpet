package com.virtualpet.Virtualpet.controller;

import com.virtualpet.Virtualpet.service.PetService;
import com.virtualpet.Virtualpet.service.FormatterService;
import com.virtualpet.Virtualpet.component.MoodGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @Autowired
    private MoodGenerator moodGenerator;

    @Autowired
    private FormatterService formatterService;

    @GetMapping("/")
    public String home() {
        return "Welcome to Fluffy's Virtual Pet World!";
    }

    @GetMapping("/pet/info")
    public String getPetInfo() {
        return petService.getPetInfo();
    }

    @GetMapping("/pet/mood")
    public String getPetMood() {
        return petService.getPetName() + " is " + moodGenerator.getRandomMood();
    }

    @PostMapping("/pet/play")
    public String playWithPet(@RequestBody String toy) {
        return petService.getPetName() + " is playing with " + toy + "!";
    }

    @GetMapping("/pet/feed")
    public String feedPet(@RequestParam double amount) {
        return "You fed " + petService.getPetName() + " a treat worth " + formatterService.formatCurrency(amount);
    }
}