package com.prinstonsam.t.systems.interview.question03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Что бужет выведено, почему?
 * Будет выведено 2, т.к. удаление элемента произойдет только в строке
 *         lst.remove(0);
 */



public class MainQuestion03 {

    public static void main(String[] args) {
        ArrayList lst = new ArrayList();

        Collection col = lst;

        lst.add("one");
        lst.add("two");
        lst.add("three");

        lst.remove(0);
        col.remove(0);

        System.out.println(lst.size());
        System.out.println(col.size());

    }
}
