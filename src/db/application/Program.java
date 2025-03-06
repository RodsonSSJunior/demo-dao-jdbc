package db.application;

import entities.Departament;

public class Program {
    public static void main(String[] args) throws Exception {
        Departament obj = new Departament("Books", 1);
        System.out.println(obj);
    }
}
