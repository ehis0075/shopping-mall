package com.market.app.shoppingmall.repository;

import com.market.app.shoppingmall.models.Customer;
import com.market.app.shoppingmall.models.projections.ProductDetailView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path="customer",
        collectionResourceRel="customer"
)
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByFullName(String fullName);



}
