package com.company;

import java.util.List;

public class Album {
    private String title;
    private int releaseDate;
    private List<Song> songList;

    public Album(String title, int releaseDate, List<Song> songList) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.songList = songList;
    }

    public Album() {
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songList=" + songList +
                '}';
    }
}
