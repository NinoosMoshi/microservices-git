package com.ninos.controller;

import com.ninos.config.PlayerStatisticsConfiguration;
import com.ninos.model.PlayerStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players-management")
public class PlayerStatisticsController {

   @Autowired
   private PlayerStatisticsConfiguration playerStatisticsConfiguration;

   @GetMapping("/statistics")
   public PlayerStatistics getPlayerStatistics() {
      return new PlayerStatistics(playerStatisticsConfiguration.getNumberTeams(),
                                  playerStatisticsConfiguration.getNumberPlayers(),
                                  playerStatisticsConfiguration.getCountry());
   }





}
