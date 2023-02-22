package com.melihcan.legendarysquad.controller;

import com.melihcan.legendarysquad.dto.request.TeamCreateRequestDto;
import com.melihcan.legendarysquad.dto.response.ResultDto;
import com.melihcan.legendarysquad.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;


    @PostMapping("/teamcreate")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> saveTeams(@RequestBody TeamCreateRequestDto dto){
        teamService.createTeams(dto);
        return ResponseEntity.ok(ResultDto.builder().state(true).build());
    }
}
