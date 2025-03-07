package dao;

import modeldaoimpl.SellerDaoJDBC;

public class DaoFactory {
  public static SellerDao createSellerDao() {
    return new SellerDaoJDBC();
  }
}
