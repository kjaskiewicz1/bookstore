package Bookstore.Bookstore.Service;

import Bookstore.Bookstore.Entity.Bookstore;
import Bookstore.Bookstore.Repository.BookstoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public interface BookstoreService {
    public String createBookDetails(Bookstore book);
    public String updateBookDetails(Bookstore book);
    public String deleteBookDetails(long ISBN);

   public List<Bookstore> getGenreDetails(String genre);

    public List<Bookstore> getPublisherDetails(String publisher);
    public List<Bookstore> getAllBooks();

    public List<Bookstore> topSellers(List<Bookstore> books);

    public List<Bookstore> getBooksByRatings(List<Bookstore> books, double minRating);

    public void discountBooksByPublisher(List<Bookstore> books, String publisher, double discountPercentage);

}
