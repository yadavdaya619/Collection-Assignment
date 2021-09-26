package com.ttn.Q5;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student("John",85,20));
        st.add(new Student("Mark",90,21));
        st.add(new Student("Robin",95,19));
        st.add(new Student("Daisy",95,20));

        System.out.println("Sorting by Scores and Names");
        st.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//               if(s1.getName().equals(s2.getName())){
                if(s1.getScore() == (s2.getScore())){
                   return s1.getName().compareTo(s2.getName());
               }
               else
                   return (int)(s1.getScore()-(s2.getScore()));
            }
        });
        st.forEach(System.out::println);

        }
    }

