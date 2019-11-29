package com.company;

import java.util.List;
import java.util.Optional;

public class Artist implements Comparable {
    // Implements attributs, constructors, and methods
    @Override
    public int compareTo(Object o) {
        Artist other = (Artist) o;
        return this.getName().compareTo(other.getName());
    }

    private String name;
    private boolean active;
    private List<Album> albumList;

    public Artist(String name, boolean active, List<Album> albumList) {
        this.name = name;
        if (active != true & active != false){
            this.active = false;
        } else {
            this.active = active;
        }
        this.albumList = albumList;
    }

    public Artist() {
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", albumList=" + albumList +
                '}';
    }

    public List<Album> getAlbum() {
        return this.albumList;
    }

    public String getName() {
        return this.name;
    }

    public void addAlbum(Album album) {
        this.albumList.add(album);
    }

    public void removeAlbum(String albumName) {
        this.albumList.remove(albumName);
    }

}
