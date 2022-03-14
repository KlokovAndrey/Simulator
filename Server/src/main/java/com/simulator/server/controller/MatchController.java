package com.simulator.server.controller;

import com.simulator.server.entity.Match;
import com.simulator.server.service.MatchService;
import com.simulator.server.service.impl.MatchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping("/matches")
@RestController
public class MatchController {

    private final MatchService matchService;

    @GetMapping("/getMatchesByTeam/{id}")
    public List<Match> findByTeam(@PathVariable("id") int id){

        return matchService.findByTeam(id);
    }
}
