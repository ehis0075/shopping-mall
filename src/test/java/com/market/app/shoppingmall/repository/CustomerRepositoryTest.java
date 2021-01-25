//package com.market.app.shoppingmall.repository;
//
//import com.market.app.shoppingmall.models.Customer;
//import com.market.app.shoppingmall.models.Product;
//import com.market.app.shoppingmall.models.ProductCategory;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Slf4j
//class CustomerRepositoryTest {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    void saveCustomer() {
//
//        Customer customer = new Customer();
//        customer.setFullName("ehis jude");
//        customer.setPhoneNumber("090887654");
//
//        Product product1 = new Product();
//        product1.setProductName("rice");
//        product1.setProductCategory(ProductCategory.FOOD);
//
//        log.info("customer object before saving ->{}", customer);
//
//        customerRepository.save(customer);
//        assertThat(customer).isNotNull();
//
//    }
//}