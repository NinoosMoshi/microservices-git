package com.ninos.repository;

import com.ninos.model.PlayerTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerTeamRepo extends JpaRepository<PlayerTeam,Long> {

    PlayerTeam findByFromAndTo(String from, String to);
}
