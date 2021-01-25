package com.market.app.shoppingmall.models.projections;

import com.market.app.shoppingmall.models.Customer;
import com.market.app.shoppingmall.models.Product;
import com.market.app.shoppingmall.models.ProductCategory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "productDetail", types = {Product.class})
public interface ProductDetail {

    String getProductName();

    ProductCategory getProductCategory();

    List<Customer> getCustomers();
}
