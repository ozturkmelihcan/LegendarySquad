package com.melihcan.legendarysquad.repository;

import com.melihcan.legendarysquad.repository.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITeamRepository extends JpaRepository<Team,Long> {
    Optional<Team> findOptionalByName(String name);
}
