package com.ninos.controller;

import com.ninos.model.PlayerTeam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football-players")
public class FootballController {

    @GetMapping("/buy/{from}/to/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from, @PathVariable String to){
       return new PlayerTeam(1L,from,to,2000,4000);
    }

}
