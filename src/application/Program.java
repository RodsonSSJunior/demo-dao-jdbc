package application;

import java.util.Date;

import entities.Departament;
import entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        Departament obj = new Departament("Books", 1);
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
        System.out.println();
        System.out.println(obj);
    }
}
