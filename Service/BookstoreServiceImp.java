package Bookstore.Bookstore.Service;


import Bookstore.Bookstore.Entity.Bookstore;
import Bookstore.Bookstore.Repository.BookstoreRepo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class BookstoreServiceImp implements BookstoreService
{
    BookstoreRepo bookstoreRepo;
    public BookstoreServiceImp(BookstoreRepo bookstoreRepo) {
        this.bookstoreRepo = bookstoreRepo;
    }

    @Override
    public String createBookDetails(Bookstore book) {
        bookstoreRepo.save(book);
        return "Success";
    }

    @Override
    public String updateBookDetails(Bookstore book) {
        bookstoreRepo.save(book);
        return "Success";
    }

    @Override
    public String deleteBookDetails(long ISBN) {
        bookstoreRepo.deleteById(String.valueOf(ISBN));
        return "Success";
    }

    @Override
    public List<Bookstore> getAllBooks() {
        return bookstoreRepo.findAll();
    }
   @Override
    public List<Bookstore> getGenre(String genre)
    {
        return bookstoreRepo.findAllById(Collections.singleton(genre));
    }
}
