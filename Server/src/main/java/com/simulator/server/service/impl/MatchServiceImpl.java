package com.simulator.server.service.impl;

import com.simulator.server.entity.Match;
import com.simulator.server.repository.MatchRepository;
import com.simulator.server.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RequiredArgsConstructor
@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    public List<Match> findByTeam(@RequestParam("id") int id){
        return matchRepository.findAll();
    }
}
