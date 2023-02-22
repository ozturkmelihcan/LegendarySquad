package com.melihcan.legendarysquad.mapper;

import com.melihcan.legendarysquad.dto.request.TeamCreateRequestDto;
import com.melihcan.legendarysquad.repository.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITeamMapper {

    ITeamMapper INSTANCE = Mappers.getMapper(ITeamMapper.class);

    Team toTeam(final TeamCreateRequestDto dto);
}
