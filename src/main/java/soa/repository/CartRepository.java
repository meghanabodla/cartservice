package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
