package entities;

import java.io.Serializable;

public class Departament implements Serializable {
  private static final long serialVersionUID = 1L;
  private String name;
  private int id;

  public Departament(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public Departament() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Departament other = (Departament) obj;
    if (id != other.id)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Departament [name=" + name + ", id=" + id + "]";
  }

}
