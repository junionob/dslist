package com.devsuperior.dslist.servicies;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;
    
    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll().stream().map(GameMinDTO::new).toList();
        return result;
    }
}
