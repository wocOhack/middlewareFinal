package com.woc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.woc.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository{

	
    @PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<User> findAll() {
		List<User> users = entityManager.createNamedQuery("User.findAll").getResultList();
		return users;
	}
}
