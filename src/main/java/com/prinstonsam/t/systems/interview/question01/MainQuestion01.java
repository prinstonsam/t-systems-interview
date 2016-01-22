/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prinstonsam.t.systems.interview.question01;

/**
 *
 * @author natalia
 *
 * Что выведется на экран? Может есть ошибки и какие?
 */
public class MainQuestion01 {
    public static void main(String[] args) {
        A a1 = new A();
        B a2 = new B();
        
        A a3 = new B();
//        B a4 = new A(); Compiler error
        a1.print();
        a1.print1();
        a2.print();
        a2.print1();
        a3.print();
        a3.print1();
//        a4.prin(); Compiler error
//        a4.print1();
    }
    
}
