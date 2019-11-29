package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class Library {
    private TreeSet<Artist> bibliothèque = new TreeSet<Artist>();

    public void displayMenu(){

    }
    public void run(){
        while (true){
        displayMenu();
        }
    }

    public void addArtist() {
        Scanner scanner = new Scanner(System.in);
        bibliothèque.add();
    }

    public void removeArtist(String name) {

    }
}
