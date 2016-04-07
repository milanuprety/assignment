/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;

import java.util.Scanner;

/**
 *
 * @author milan
 */
public class select {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String text = "the quick brown fox jumps over the lazy dog";
        process(text);
    }

    private static void process(String c) {
        String b = c.toLowerCase();
        int counter = 0;
        int space = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'a'){
                counter++;
            }
            else if (b.charAt(i) == 'e'){
            counter++;
        }
            else if (b.charAt(i) == 'i'){
                counter++;
            }
            else if (b.charAt(i) == 'o'){
                    counter++;
                    }
            else if (b.charAt(i) == 'u')
            {
                counter++;
            }
            else if (b.charAt(i) == ' '){
                    space++;
                    }

            }
            System.out.print("The text has "+counter+" vowels "+(b.length()-counter-space)+" consonants");
            System.out.println(" and "+space+" spaces");
            System.out.println("Total characters = "+b.length());
        }

    }

