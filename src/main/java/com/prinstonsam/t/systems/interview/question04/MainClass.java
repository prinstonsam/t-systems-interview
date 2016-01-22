package com.prinstonsam.t.systems.interview.question04;

/**
 * Написать метод, выводящий на экран
 * 1
 * 2-1
 * 3-2-1
 * 4-3-2-1
 * 5-4-3-2-1
 * 6-5-4-3-2-1
 */
public class MainClass {

    public static void printRequiredString(int value){

        if (value<1) {
            return;
        }

        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <=value; i++) {
            for(int j = sb.length()-1; j>=0; j--){
                System.out.print(sb.toString().charAt(j));
            }
            sb.append("-"+i);
            System.out.println();
        }

        for(int j = sb.length()-1; j>=0; j--){
            System.out.print(sb.toString().charAt(j));
        }

    }

    public static void main(String[] args) {

        printRequiredString(6);

    }
}
