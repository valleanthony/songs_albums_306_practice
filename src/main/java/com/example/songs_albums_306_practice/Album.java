package com.example.songs_albums_306_practice;



import javax.persistence.*;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String albumName;
    private String artist;
    @ManyToOne(fetch = FetchType.EAGER)
    private Song song;

}
