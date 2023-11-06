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

   public List<Bookstore> getGenre(String genre);
    public List<Bookstore> getAllBooks();

}
