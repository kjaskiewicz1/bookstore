package com.mycompany.geektextbookratingsapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    private final Map<String, List<BookRating>> bookRatingsMap = new HashMap<String, List<BookRating>>();

    @PostMapping("/{bookId}/ratings")
    public String addBookRating(@PathVariable String bookId, @RequestBody BookRating bookRating) {
        if (!bookRatingsMap.containsKey(bookId)) {
            bookRatingsMap.put(bookId, new ArrayList<BookRating>());
        }
        List<BookRating> ratings = bookRatingsMap.get(bookId);
        ratings.add(bookRating);
        return "Book rating added for book with ID: " + bookId;
    }

    @GetMapping("/{bookId}/ratings")
    public List<BookRating> getBookRatings(@PathVariable String bookId) {
        if (bookRatingsMap.containsKey(bookId)) {
            return bookRatingsMap.get(bookId);
        } else {
            return new ArrayList<BookRating>(); // Return an empty list if the book doesn't exist
        }
    }

    public BookController() {
        // Adding two dummy books with dummy ratings
        List<BookRating> book1Ratings = new ArrayList<BookRating>();
        List<BookRating> book2Ratings = new ArrayList<BookRating>();

        // Adding dummy ratings for book1
        book1Ratings.add(new BookRating(4.5));
        book1Ratings.add(new BookRating(3.7));

        // Adding dummy ratings for book2
        book2Ratings.add(new BookRating(3.2));
        book2Ratings.add(new BookRating(4.0));

        // Adding the books to the map
        bookRatingsMap.put("book1", book1Ratings);
        bookRatingsMap.put("book2", book2Ratings);
    }
}






