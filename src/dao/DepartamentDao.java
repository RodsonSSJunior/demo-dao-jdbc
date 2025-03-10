package dao;

import java.util.List;

import entities.Departament;

public interface DepartamentDao {
  void insert(Departament obj);

  void update(Departament obj);

  void deleteById(Integer id);

  Departament findById(Integer id);

  List<Departament> findAll();
}
