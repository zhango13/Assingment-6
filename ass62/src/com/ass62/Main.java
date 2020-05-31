package com.ass62;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Magazine publishing!");
        Magazine magazine = new Magazine();
        MagSubscriber subs1 = new MagSubscriber();
        MagSubscriber subs2 = new MagSubscriber();
        magazine.attachMag(subs1);
        magazine.attachMag(subs2);
        System.out.println("Set serial number for magazines");
        int n= scan.nextInt();
        magazine.setNumber(n);
        System.out.println("Magazine serial number for subscriber 1 is " + subs1.getMagazineNumber());
        System.out.println("Magazine serial number for subscriber 2 is " + subs2.getMagazineNumber());
        System.out.println("We will detach magazine of 2 subscriber");
        magazine.detachMag(subs2);
        System.out.println("Set serial number for magazine of first subscriber");
        int z= scan.nextInt();
        magazine.setNumber(z);
        System.out.println("Magazine serial number for subscriber 1 is " + subs1.getMagazineNumber());
        System.out.println("Magazine serial number for subscriber 2 is " + subs2.getMagazineNumber());
        System.out.println("Now Paper publishing!");
        Paper paper = new Paper();
        PapSubscriber psubs1 = new PapSubscriber();
        PapSubscriber psubs2 = new PapSubscriber();
        paper.attachPap(psubs1);
        paper.attachPap(psubs2);
        System.out.println("Set serial number for papers");
        int a= scan.nextInt();
        paper.setNumber(a);
        System.out.println("Paper serial number for subscriber 1 is " + psubs1.getPaperNumber());
        System.out.println("Paper serial number for subscriber 2 is " + psubs2.getPaperNumber());
        System.out.println("We will detach paper of 2 subscriber");
        paper.detachPap(psubs2);
        System.out.println("Set serial number for paper of first subscriber");
        int b= scan.nextInt();
        paper.setNumber(b);
        System.out.println("Paper serial number for subscriber 1 is " + psubs1.getPaperNumber());
        System.out.println("Paper serial number for subscriber 2 is " + psubs2.getPaperNumber());
    }
}
