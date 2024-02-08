package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

    void insert(Department obj); // responsável por inserir no db o objeto  ao enviar como parâmetro de entrada.
    
    void update(Department obj);
    void deleteById(Integer id);
    Department finById(Integer id);
    List<Department> findAll();
}
