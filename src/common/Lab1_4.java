/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Billy-Mac
 */
public class Lab1_4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Jake", "111");
        Employee e2 = new Employee("Doe", "John", "222");
        Employee e3 = new Employee("Grande", "Ariana", "333");
        Employee e4 = new Employee("Bieber", "Justin", "444");
        
        // LAB #2 
        List list1 = new ArrayList();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        list1.add(e4);
        
        for (int i = 0; i < list1.size(); i++){
            Employee e = (Employee)list1.get(i);
            System.out.println(e.toString());
        }
        
        // LAB #3
        List<Employee> list2 = new ArrayList<>();
        list2.add(e1);
        list2.add(e2);
        list2.add(e3);
        list2.add(e4);
        
        for (Employee e : list2) {
            System.out.println(e.toString());
        }
        
        // OR
        
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).toString());
//            Employee e = list2.get(i);
//            System.out.println(e.toString());
        }
        
        // LAB #4
        Dog d1 = new Dog("Bob", 1);
        Dog d2 = new Dog("Jim", 2);
        Dog d3 = new Dog("Bob", 1);
        Dog d4 = new Dog("Jake", 3);
        
        List<Dog> list3 = new ArrayList<>();
        list3.add(d1);
        list3.add(d2);
        list3.add(d3);
        list3.add(d4);
        
        Set<Dog> set1 = new HashSet<>(list3);
        
        List<Dog> list4 = new ArrayList<>(set1);
        
        for (Dog d : list4) {
            System.out.println(d.toString());
        }
    }
}
