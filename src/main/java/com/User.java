package com;

import java.io.*;

public class User {
    public static void deserialization(String filename) {
    Employee emp1=null;
    try{FileInputStream file = new FileInputStream(filename);
        ObjectInputStream input = new ObjectInputStream(file);
        emp1=(Employee)input.readObject();
        System.out.println("deserialize output" );
        System.out.println(emp1.empName +" "+ emp1.empId);
        input.close();
        file.close();
    }catch(IOException | ClassNotFoundException e){e.printStackTrace();}
    }

    public static void serialization(Object obj,String filename){

    try{
    FileOutputStream file = new FileOutputStream(filename);
    ObjectOutputStream output = new ObjectOutputStream(file);

    // write object into the file
    output.writeObject(obj);
    System.out.println("Serialize has been done");
    output.close();
    file.close();}
    catch(IOException e){
        e.printStackTrace();
    }
}
}
