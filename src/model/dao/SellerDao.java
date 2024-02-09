package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

    void insert(Seller obj); // responsável por inserir no db o objeto  ao enviar como parâmetro de entrada.
    
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
