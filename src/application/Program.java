package application;

import java.util.Date;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Departament;
import entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
