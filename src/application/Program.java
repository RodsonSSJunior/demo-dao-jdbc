package application;

import java.util.Date;
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
        System.out.println();
        System.out.println("=== TESTE 2: seller findbyDepartament ===");
        Department department = new Department(null, 2);
        List<Seller> list = sellerDao.findByDepartament(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();
        System.out.println("=== TESTE 3: seller findbyAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("=== TESTE 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 40000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        System.out.println("=== TESTE 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update Completed!!");

    }
}
