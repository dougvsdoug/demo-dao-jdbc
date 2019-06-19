package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert( Seller obj);// insere o objeto no banco de dados
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);// procura o vendedor no banco de dados e retorna ele, se nao existir
	// retorna nulo
	List<Seller> findAll();//retorna todos os vendores
	List<Seller> findByDepartment(Department department);
	
}

