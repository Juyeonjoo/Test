package com.hellopshop.order;

import com.hellopshop.product.Product;
import com.hellopshop.user.User;

public class Order {

    User user;
    Product product;

    //public 이 붙어야 다른 패키지에서 이 Order를 호출할 수 있음
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
