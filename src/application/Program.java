package application;

import java.util.List;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller findbyId ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("=== TESTE 2: seller findbyDepartament ===");
        Department department = new Department(null, 2);
        List<Seller> list = sellerDao.findByDepartament(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
