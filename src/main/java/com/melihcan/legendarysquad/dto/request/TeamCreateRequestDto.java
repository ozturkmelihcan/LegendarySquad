package com.melihcan.legendarysquad.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeamCreateRequestDto {

    private String name;

    private int teamSize;

    private String amblem ;

    private String coachName;

    private int point=0;
}
