package com.example.javacode;

import java.util.Arrays;

public class MainActivity {

        public static void main(String[] arg) {

                String[] Courses = {"CSC3117 Automata,Complexity and Computatability", "CSC3112 Data communication and Networks", "CSC3104 Computer Networks and Security", "CSC3113 Entreprenuership ", "CSC3116 Artificial Intelligence", "CSC3115 Mobile Programming"};
                for (int i = 0; i < Courses.length; i++) {
                        System.out.println(Courses[i]);
                }
        }
}