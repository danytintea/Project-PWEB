package com.example.dto;

import javafx.scene.control.Hyperlink;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NonNull
@Builder
public class PlayerDto {

    private int id;
    private String lastName;
    private String firstName;
    private String club;
    private int age;
    private String role;
    private String image;
    private String info;
    private String value;
    private int number;
    private String national;
}
