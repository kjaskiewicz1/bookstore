package com.mycompany.geektextbookratingsapi;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    private final Map<String, List<BookRating>> bookRatingsMap = new HashMap<String, List<BookRating>>();
    private final Map<String, List<BookComment>> bookCommentsMap = new HashMap<String, List<BookComment>>();

    @PostMapping("/{bookId}/ratings")
    public String addBookRating(@PathVariable String bookId, @RequestBody BookRating bookRating) {
        if (!bookRatingsMap.containsKey(bookId)) {
            bookRatingsMap.put(bookId, new ArrayList<BookRating>());
        }
        List<BookRating> ratings = bookRatingsMap.get(bookId);
        ratings.add(bookRating);
        return "The Book rating was added for book with ID: " + bookId;
    }

    @GetMapping("/{bookId}/ratings")
    public String getBookRatings(@PathVariable String bookId) {
    if (bookRatingsMap.containsKey(bookId)) {
        List<BookRating> ratings = bookRatingsMap.get(bookId);
        double averageRate = calculateAverageRate(ratings);
        return "The rating of the book is: " + averageRate;
    } else {
        return "The book was not found";
    }
}

private double calculateAverageRate(List<BookRating> ratings) {
    if (ratings.isEmpty()) {
        return 0.0;
    }
    double totalRating = 0.0;
    for (BookRating rating : ratings) {
        totalRating += rating.getRating();
    }
    return totalRating / ratings.size();
}
   
    @PostMapping("/{bookId}/comments")
public String addBookComment(@PathVariable String bookId, @RequestBody BookComment bookComment) {
    if (!bookCommentsMap.containsKey(bookId)) {
        bookCommentsMap.put(bookId, new ArrayList<BookComment>());
    }
    List<BookComment> comments = bookCommentsMap.get(bookId);
    comments.add(bookComment);
    return "The comment was added to the book: " + bookId;
}

    @GetMapping("/{bookId}/comments")
    public List<BookComment> getBookComments(@PathVariable String bookId) {
        if (bookCommentsMap.containsKey(bookId)) {
            return bookCommentsMap.get(bookId);
        } else {
            return new ArrayList<BookComment>(); 
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
        
         // Adding dummy comments for book1
         List<BookComment> book1Comments = new ArrayList<BookComment>();
         book1Comments.add(new BookComment(1, "The book was great!"));
         book1Comments.add(new BookComment(2, "I loved reading it."));

        // Adding dummy comments for book2
         List<BookComment> book2Comments = new ArrayList<BookComment>();
         book2Comments.add(new BookComment(1, "The book was interesting."));
         book2Comments.add(new BookComment(3, "The book could be better."));

        // Adding the books to the map
        bookRatingsMap.put("book1", book1Ratings);
        bookRatingsMap.put("book2", book2Ratings);
        
        bookCommentsMap.put("book1", book1Comments);
        bookCommentsMap.put("book2", book2Comments);
    }
}








