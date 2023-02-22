package com.melihcan.legendarysquad.repository;


import com.melihcan.legendarysquad.repository.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IPlayerRepository extends JpaRepository<Player,Long> {
}
