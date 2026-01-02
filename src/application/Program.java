package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller findbyId ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
