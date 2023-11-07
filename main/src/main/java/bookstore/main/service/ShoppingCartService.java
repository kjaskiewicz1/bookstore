package com.example.bookstoreshoppingcart.Service;

import com.example.bookstoreshoppingcart.Model.Book;
import com.example.bookstoreshoppingcart.Model.ShoppingCart;
import com.example.bookstoreshoppingcart.Repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    // Add methods for shopping cart operations here

}
