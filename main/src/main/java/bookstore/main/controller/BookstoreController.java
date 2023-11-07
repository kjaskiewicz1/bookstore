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



    public BookstoreController(BookstoreService booksService) {
        this.booksService = booksService;
    }


  /*@GetMapping("/genre/{genre}")
    public ResponseEntity<Bookstore> getGenreBooks(@PathVariable(name = "genre") String genre)
    {
        List<Bookstore> book = booksService.getAllBooks();
        if (book.isPresent()){
            return ResponseEntity.ok(book.get());
        }
        book.getGenre();
      return ResponseEntity.ok(book);
    }
*/
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
