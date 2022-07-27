package com.javainterview.statickeywords;

class Counter {
    int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}

class Counter2 {
    static int count = 0;

    Counter2() {
        count++;
        System.out.println(count);
    }
}

public class Static_Variable1 {
    public static void main(String[] args) {
     /*   Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();*/

        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}
