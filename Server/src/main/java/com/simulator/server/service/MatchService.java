package com.simulator.server.service;

import com.simulator.server.entity.Match;

import java.util.List;

public interface MatchService {
    List<Match> findByTeam(int id);
}
