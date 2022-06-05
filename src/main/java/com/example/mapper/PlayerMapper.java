package com.example.mapper;

import com.example.dto.PlayerDto;
import com.example.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerDto mapPlayerDto(Player player) {
        return PlayerDto.builder()
                .id(player.getId())
                .lastName(player.getLastName())
                .firstName(player.getFirstName())
                .club(player.getClub())
                .age(player.getAge())
                .role(player.getRole())
                .image(player.getImage())
                .info(player.getInfo())
                .value(player.getValue())
                .number(player.getNumber())
                .national(player.getNational())
                .build();

    }

    public Player mapPlayer(PlayerDto playerDto) {
        return Player.builder()
                .id(playerDto.getId())
                .lastName(playerDto.getLastName())
                .firstName(playerDto.getFirstName())
                .club(playerDto.getClub())
                .age(playerDto.getAge())
                .role((playerDto.getRole()))
                .image(playerDto.getImage())
                .info(playerDto.getInfo())
                .value(playerDto.getValue())
                .number(playerDto.getNumber())
                .national(playerDto.getNational())
                .build();
    }
}
