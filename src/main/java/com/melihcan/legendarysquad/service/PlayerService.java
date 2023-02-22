package com.melihcan.legendarysquad.service;

import com.melihcan.legendarysquad.repository.IPlayerRepository;
import com.melihcan.legendarysquad.repository.entity.Player;
import com.melihcan.legendarysquad.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PlayerService extends ServiceManager<Player,Long> {

    private final IPlayerRepository playerRepository;

    public PlayerService(IPlayerRepository playerRepository){
        super(playerRepository);
        this.playerRepository=playerRepository;
    }
}
