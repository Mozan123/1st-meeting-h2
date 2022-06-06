package com.nadhem.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nadhem.produit.model.Users;

@Repository
public interface userJpaRespository extends JpaRepository<Users,Long>{

	Users findByName(String name);
	
	Users findBySalary(int sal);

}
