package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Album test1 = new Album();
        Album test2 = new Album();
        Album test3 = new Album();
        ArrayList<Album> albumList = new ArrayList<>();
        albumList.add(test1);
        albumList.add(test2);
        albumList.add(test3);
        Artist artist = new Artist("LOL",true, albumList);
        System.out.println(artist);
    }
}
