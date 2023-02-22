package com.melihcan.legendarysquad.service;

import com.melihcan.legendarysquad.dto.request.TeamCreateRequestDto;
import com.melihcan.legendarysquad.mapper.ITeamMapper;
import com.melihcan.legendarysquad.repository.ITeamRepository;
import com.melihcan.legendarysquad.repository.entity.Team;
import com.melihcan.legendarysquad.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService extends ServiceManager<Team,Long> {

    private final ITeamRepository teamRepository;

    public TeamService(ITeamRepository teamRepository){
        super(teamRepository);
        this.teamRepository=teamRepository;
    }

    public void createTeams(TeamCreateRequestDto dto) {
        Team team = ITeamMapper.INSTANCE.toTeam(dto);
        Optional<Team>team1 = teamRepository.findOptionalByName(team.getName());
        if (team1.isEmpty()){
            save(team);
        }
    }
}
