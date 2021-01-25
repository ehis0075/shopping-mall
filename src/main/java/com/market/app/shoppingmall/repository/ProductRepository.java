package com.market.app.shoppingmall.repository;

import com.market.app.shoppingmall.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path= "product",
        collectionResourceRel ="product"
        //excertProjection = ProductDetailView.class
)
public interface ProductRepository extends JpaRepository<Product, Long> {

}
