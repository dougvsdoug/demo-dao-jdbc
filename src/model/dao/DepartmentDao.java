package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert( Department obj);// insere o objeto no banco de dados
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);// procura o departamento no banco de dados e retorna ele, se nao existir
	// retorna nulo
	List<Department> findAll();//retorna todos os departamentos
	
}
