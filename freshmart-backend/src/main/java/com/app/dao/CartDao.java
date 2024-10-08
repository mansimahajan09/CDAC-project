package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Cart;
import com.app.entity.User;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer> {

	List<Cart> findByUser(User user);

}
