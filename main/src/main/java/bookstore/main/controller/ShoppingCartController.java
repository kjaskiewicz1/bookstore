package com.example.bookstoreshoppingcart.Controller;

import com.example.bookstoreshoppingcart.Model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shoppingcart")
public class ShoppingCartController {

    @GetMapping("/subtotal")
    public double getSubtotal(@RequestParam Long userId) {
        // Logic to calculate subtotal based on userId
        // Return the calculated subtotal
        return 100.0; // Example value, replace with actual calculation
    }

    @PostMapping("/add")
    public void addItemToCart(@RequestParam Long bookId, @RequestParam Long userId) {
        // Logic to add book to user's shopping cart
        // No need to return anything (void)
    }

    @GetMapping("/list")
    public List<Book> getBooksInCart(@RequestParam Long userId) {
        // Logic to retrieve list of books in user's cart based on userId
        // Return a list of Book objects
        List<Book> books = new ArrayList<>(); // Example, replace with actual retrieval
        return books;
    }

    @DeleteMapping("/remove")
    public void removeItemFromCart(@RequestParam Long bookId, @RequestParam Long userId) {
        // Logic to remove book from user's shopping cart
        // No need to return anything (void)
    }
}
