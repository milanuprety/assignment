/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Display;
import static com.leapfrog.Display.FourthMenu.menu4;
import static com.leapfrog.Display.ThirdMenu.menu3;

import java.util.Scanner;

/**
 *
 * @author milan
 */
public class MainMenu extends SecondaryMenu{

    public static void menu1() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("****MENU****");
            System.out.println("1. Student Records");
            System.out.println("2. Teacher Records");
            System.out.println("3. Course Records");
            System.out.println("4. Exit");

            System.out.println("Enter your choice[1-4]");
            switch (input.nextInt()) {
                case 1:
                    menu2();
                    break;
                case 2:
                    menu3();
                    break;
                case 3:
                    menu4();
                    break;
                case 4:
                    System.out.println("Would your like to Exit[Y/N]?");
            if (input.next().equalsIgnoreCase("y")){
                System.exit(0);
                     break;

            }
            
            }

        } // while
    }

    
}
