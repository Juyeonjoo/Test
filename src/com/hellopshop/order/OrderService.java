package com.hellopshop.order;

import com.hellopshop.product.Product;
import com.hellopshop.user.User;

public class OrderService {

    public void order() {

        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
