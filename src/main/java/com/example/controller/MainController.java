package com.example.controller;

import com.example.dto.PlayerDto;
import com.example.entity.Player;

import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PlayerService playerService;

    @GetMapping(value = "/overviewPlayer")
    public String showOverview(Model model) {
        List<PlayerDto> players = playerService.getPlayer();
        model.addAttribute("players",players);
        return "overviewPlayer";
    }

    @GetMapping(value = "/players")
    public String showPlayers(Model model) {
        List<PlayerDto> players = playerService.getPlayer();
        model.addAttribute("players",players);
        return "players";
    }

    @GetMapping(value = "/formPlayer")
    public String showFormPlayer(Model model) {
        return "formPlayer";
    }

    @GetMapping(value = "/home")
    public String showHome(Model model) {
        return "home";
    }

    @GetMapping(value = "/404")
    public String show404(Model model) {
        return "404";
    }

    @GetMapping(value = "/contact")
    public String showcontact(Model model) {
        return "contact";
    }

    @GetMapping(value = "/deletePlayer/{id}")
    public String deletePlayer(@PathVariable("id") int id, Model model){

        playerService.deletePlayerById(id);
        return "redirect:/overviewPlayer";
    }

    @GetMapping(value = "/editPlayer/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model){

        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "redirect:/formPlayer";
    }

    @PostMapping(value = "/addPlayer")
    public String addPlayer(@ModelAttribute("player") PlayerDto player, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "error";
        }

        model.addAttribute("player", player);
        playerService.savePlayerToDataBase(player);

        return "redirect:/overviewPlayer";
    }

}
