package com.example.service;


import com.example.dto.PlayerDto;
import com.example.entity.Player;
import com.example.mapper.PlayerMapper;
import com.example.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerMapper mapper;

    public List<PlayerDto> getPlayer(){
        return playerRepository.findAll().stream()
                .map(e -> mapper.mapPlayerDto(e))
                .collect(Collectors.toList());
    }

    public void savePlayerToDataBase(PlayerDto playerDto) {
        Player player = mapper.mapPlayer(playerDto);
        playerRepository.save(player);
    }

    public Player getPlayerById(int idPlayer) {
        Optional<Player> player = playerRepository.findById(idPlayer);
        return player.get();
    }

    public void deletePlayerById(int id) {
        playerRepository.delete(playerRepository.getById(id));
    }

}
