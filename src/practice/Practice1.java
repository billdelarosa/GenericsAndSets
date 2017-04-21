/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Billy-Mac
 */
public class Practice1 {
    public static void main(String[] args) {
        /* 
        a list is an ordered structure of object
        the ordering is the ENTRY order --- no sorting happening
        lists store ONLY objects 
        */
        
        List<String> list = new ArrayList<>();
        list.add("Beer");
        list.add("Chips");
        list.add("Vodka");
        list.add("Beer");
        list.add("Beer");
        
//        Set<String> noDupes = new HashSet<>(list);
//        list = new ArrayList<>(noDupes);
        
        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        
//        for (String str : list){
//            System.out.println(str);
//        }
        
        
    }
}
