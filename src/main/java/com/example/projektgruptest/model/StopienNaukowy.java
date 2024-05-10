package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="StopnieNaukowe")
@Getter
@Setter
public class StopienNaukowy {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nazwa")
    private String nazwa;

    //KLUCZE OBCE
    @OneToMany(mappedBy = "stopienNaukowy")
    Set<Pracownik> pracownikSet;
}
