package Bookstore.Bookstore.Controller;

import Bookstore.Bookstore.Entity.Bookstore;
import Bookstore.Bookstore.Repository.BookstoreRepo;
import Bookstore.Bookstore.Service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookstoreController {

    BookstoreService booksService;

    private List<Bookstore> books = new ArrayList<>();

    public BookstoreController(BookstoreService booksService) {
        this.booksService = booksService;
    }


  @GetMapping("/genre/{Genre}")
    public List<Bookstore> getGenreBooks(@PathVariable("Genre") String genre)
    {
        //booksService.getAllBooks();
       return booksService.getGenreDetails(genre);
    }

    @GetMapping("/publisher/{Publisher}")
    public List<Bookstore> getPublisherBooks(@PathVariable("Publisher") String publisher)
    {
        //booksService.getAllBooks();
        return booksService.getPublisherDetails(publisher);
    }

    @GetMapping("/topsellers")
    public List<Bookstore> getTopSellers()
    {
        List<Bookstore> allBooks = booksService.getAllBooks();
        return booksService.topSellers(allBooks);
    }

    @GetMapping("/rating")
    public List<Bookstore> getBooksbyRatings(@RequestParam("Rating") double minRating)
    {
        List<Bookstore> allBooks = booksService.getAllBooks();
        return booksService.getBooksByRatings(allBooks,minRating);
    }

    @PutMapping("/Discount")
    public void discountBooksByPublisher(@RequestParam("Publisher") String publisher, @RequestParam("Discount") double discountPercentage)
    {
        List<Bookstore> allBooks = booksService.getAllBooks();
        booksService.discountBooksByPublisher(allBooks,publisher,discountPercentage);
    }


    @GetMapping
    public List<Bookstore> getAllBookDetails()
    {

        return booksService.getAllBooks();
    }

    @PostMapping
    public String postDetails(@RequestBody Bookstore books)
    {
        booksService.createBookDetails(books);
        return "Added Successfully";
    }
    @PutMapping
    public String updateDetails(@RequestBody Bookstore books)
    {
        booksService.updateBookDetails(books);
        return "Updated Successfully";
    }
    @DeleteMapping("{ISBN}")
    public String deleteDetails(@PathVariable("ISBN") long ISBN)
    {
        booksService.deleteBookDetails(ISBN);
        return "Deleted Successfully";
    }

}
