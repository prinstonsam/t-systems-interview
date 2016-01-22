package com.prinstonsam.t.systems.interview.question02;

/**
 * Что будет выведено? Предложения по рефакторингу.
 * Будет 0, т.к. hight при инициализации 0. mult выполнится из дочернего
 * Предложения:
 * 1. Передавать значение measure в параметрах конструктора
 * 2. Вообще убрать measure, а вычислять динамически с помощью метода (меняется от род к дочернему)
 * 3. метод mult вынести в интерфейс
 */

class Parent{
    int field01;
    int field02;
    int measure;

    Parent(int value1, int value2) {
        this.field01=value1;
        this.field02=value2;
        this.mult();
    }

    void mult(){
        measure = field01 * field02;
    }

    int getMeasure(){
        return this.measure;
    }
}

class Derived extends Parent{
    int high;

    Derived(int value1, int value2, int value3){
        super(value1, value2);
        this.high = value3;
    }

    @Override
    void mult(){
        measure = field01 * field02 * high;
    }
}

public class MainQuestion02 {

    public static void main(String[] args) {
        Derived derived = new Derived(100, 100, 100);
        System.out.println(derived.getMeasure());
    }
}
