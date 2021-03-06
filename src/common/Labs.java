/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author pdavis13
 */
public class Labs {
    public static void main(String[] args) {
        Movie m1 = new Movie("titlefoo", "directorfoo", 100);
        Movie m2 = new Movie("titlebar", "directorbar", 200);
        Movie m3 = new Movie("titlezed", "directorzed", 300);
        Movie m4 = new Movie("titlefoo", "directorfoo", 100);
        
        Map<String, Movie> hashMap =
                new HashMap<String, Movie>();
        hashMap.put(Integer.toString(m1.getMovieID()), m1);
        hashMap.put(Integer.toString(m2.getMovieID()), m2);
        hashMap.put(Integer.toString(m3.getMovieID()), m3);
        hashMap.put(Integer.toString(m4.getMovieID()), m4);
        
        Movie m5 = hashMap.get("100");
        
        Set<String> hashMapKeys = hashMap.keySet();
        for(String key : hashMapKeys) {
            Movie m = hashMap.get(key);
            System.out.println(m.toString());
        }
        System.out.println("");

        Map<String, Movie> treeMap =
                new TreeMap<String, Movie>();
        treeMap.put(Integer.toString(m1.getMovieID()), m1);
        treeMap.put(Integer.toString(m2.getMovieID()), m2);
        treeMap.put(Integer.toString(m3.getMovieID()), m3);
        treeMap.put(Integer.toString(m4.getMovieID()), m4);
        
        Set<String> treeMapKeys = treeMap.keySet();
        for(String key : treeMapKeys) {
            Movie m = hashMap.get(key);
            System.out.println(m.toString());
        }
        System.out.println("");

        Collection<Movie> values = treeMap.values();
        List<Movie> sortedList = new ArrayList<Movie>(values);

        Collections.sort(sortedList);
        for(Movie m : sortedList) {
            System.out.println(m);
        }
        System.out.println("");

        Collection<Movie> values2 = treeMap.values();
        List<Movie> sortedList2 = new ArrayList<Movie>(values2);
        Collections.sort(sortedList2, new MovieByID());
        for(Movie m : sortedList2) {
            System.out.println(m);
        }
        System.out.println("");
        
        Set<Movie> treeSet = new TreeSet<Movie>();
        treeSet.add(m1);
        treeSet.add(m2);
        treeSet.add(m3);
        treeSet.add(m4);
        
        for(Movie m : treeSet) {
            System.out.println(m);
        }
    }
}
