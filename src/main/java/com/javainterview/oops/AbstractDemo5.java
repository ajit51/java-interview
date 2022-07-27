package com.javainterview.oops;

abstract class Server{
    protected final String name;

    public Server(String name){
        this.name = name;
        System.out.println(name);
    }

    public abstract boolean start();
}

class Tomcat extends Server{
    public Tomcat(String name){
        super(name);
    }

    public boolean start(){
        System.out.println( this.name + " started successfully");
        return true;
    }
}
public class AbstractDemo5 {
    public static void main(String[] args) {
        Server s = new Tomcat("Apache Tomcat");
        s.start();
    }
}
