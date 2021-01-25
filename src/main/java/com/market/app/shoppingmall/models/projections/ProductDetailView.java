package com.market.app.shoppingmall.models.projections;

import com.market.app.shoppingmall.models.Customer;
import com.market.app.shoppingmall.models.Product;
import com.market.app.shoppingmall.models.ProductCategory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "productDetailView", types = {Product.class})
public interface ProductDetailView {

    @Value("#{target.productName}") // it let you change the productname
    String getItemName();

    ProductCategory getProductCategory();

    List<Customer> getCustomers();

    // counts products
    @Value("#{target.product.size()}")
    Integer getProductCount();
}
