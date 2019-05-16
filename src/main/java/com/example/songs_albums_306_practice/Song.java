package com.example.songs_albums_306_practice;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String artist;
   @ManyToOne(fetch = FetchType.EAGER)
     private Album album;




}
