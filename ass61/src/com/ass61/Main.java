package com.ass61;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello my friend, welcome to the new game called Azerod!");
        System.out.println("Enter what character race you what to choose --Orc--Elve--Dragon--Human--");
        try {
            String a = null;
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            System.out.println("Your choice is :" + choice);

            character chart = new character();

            if( "Orc".equalsIgnoreCase(choice) )
            {
                chart.setAct(new orc());
            }
            else if("Human".equalsIgnoreCase(choice))
            {
                chart.setAct(new human());
            }
            else if("Elve".equalsIgnoreCase(choice))
            {
                chart.setAct(new elve());
            }
            else if("Dragon".equalsIgnoreCase(choice))
            {
                chart.setAct(new dragon());
            }
            else
            {
                System.out.println(a.charAt(0));
            }
            System.out.println("Mode of action has : "+
                    chart.getAct());
            chart.whaticando();
            chart.StartGame();
        } catch(NullPointerException e) {
            System.out.println("No such race, try to write correctly...");
        }


    }
}
