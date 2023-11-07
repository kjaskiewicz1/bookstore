package com.example.bookstoreshoppingcart.Repository;

import com.example.bookstoreshoppingcart.Model.Book;
import com.example.bookstoreshoppingcart.Model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    // Define custom repository methods here (if needed)
}
