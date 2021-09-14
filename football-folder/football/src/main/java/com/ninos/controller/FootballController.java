package com.ninos.controller;

import com.ninos.model.PlayerTeam;
import com.ninos.repository.PlayerTeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football-players")
public class FootballController {

    @Autowired
    private PlayerTeamRepo playerTeamRepo;

    @GetMapping("/buy/{from}/to/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from, @PathVariable String to){

        PlayerTeam playerTeam = playerTeamRepo.findByFromAndTo(from,to);

       return playerTeam;
    }

}
