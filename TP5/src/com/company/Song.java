package com.company;

public class Song {
    private String title;
    private int duree;

    public Song(String title, int duree) {
        this.title = title;
        this.duree = duree;
    }

    public Song() {
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuree() {
        return this.duree;
    }

    private int seconde() {
        int time = getDuree();
        return time % 60;
    }

    private int minute() {
        int time = getDuree();
        int seconde = seconde();
        return (time - seconde) / 60;
    }

    public String convertDuration() {
        return minute() + "," + seconde();
    }

    @Override
    public String toString() {
        return getTitle() + " (" + minute() + "," + seconde() + ")";
    }
}
