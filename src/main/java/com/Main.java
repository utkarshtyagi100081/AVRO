package com;

import static com.User.deserialization;
import static com.User.serialization;

public class Main {
    public static void main (String...args)  {
        Employee emp = new Employee("Alien", 100011);
        String filename="detail.ser";
        serialization(emp,filename);
        deserialization(filename);
    }

}
