package com.market.app.shoppingmall.repository;

import com.market.app.shoppingmall.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
