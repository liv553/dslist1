package com.liv553.dslist1.services;


import com.liv553.dslist1.dto.GameMinDTO;
import com.liv553.dslist1.entities.Game;
import com.liv553.dslist1.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
