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
        System.out.print(revertString(sb));
        System.out.println();
        for (int i = 2; i <=value; i++) {
            sb.append("-"+i);
            System.out.print(revertString(sb));
            System.out.println();
        }
    }

    private static String revertString(StringBuilder sb) {
        if( sb.length() == 1){
            return sb.toString();
        }
        StringBuilder outStr = new StringBuilder();
        int i = sb.length()-1;
        StringBuilder tmp = new StringBuilder();
        do {
            if(sb.toString().charAt(i)!='-'){
                tmp.append(sb.toString().charAt(i));
            }
            else{
                outStr.append(tmp.reverse().toString()).append('-');
                tmp = new StringBuilder();
            }
            i--;

        }while(i>0);

        outStr.append("1");
        return outStr.toString();
    }

    public static void main(String[] args) {
        printRequiredString(12);
    }
}
