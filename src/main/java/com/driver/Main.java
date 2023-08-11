package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.name = "Ahad";
//        System.out.println(rwOnly.name);
//        name has private access in com.driver.RWOnly
        rwOnly.setName("Ahad");
        String name = rwOnly.getName();
    }
}