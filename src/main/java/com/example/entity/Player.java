package com.example.entity;

import javafx.scene.control.Hyperlink;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NonNull
@Builder
@Entity
@Table(name="t_player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="lastname")
    private String lastName;

    @Column(name="firstname")
    private String firstName;

    @Column(name="club")
    private String club;

    @Column(name="age")
    private int age;

    @Column(name="role")
    private String role;

    @Column(name="image")
    private String image;

    @Column(name="info")
    private String info;

    @Column(name="value")
    private String value;

    @Column(name="number")
    private int number;

    @Column(name="national")
    private String national;

}
