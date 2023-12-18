package com.nighthawk.spring_portfolio.mvc.music;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;

    private int duration; // Duration in seconds

    @ManyToMany(mappedBy = "songs")
    private List<Album> albums = new ArrayList<>();

    // Constructor with parameters
    public Song(Long id, String title,int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }
}
