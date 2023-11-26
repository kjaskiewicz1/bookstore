package Bookstore.Bookstore.Service;


import Bookstore.Bookstore.Entity.Bookstore;
import Bookstore.Bookstore.Repository.BookstoreRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

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


    public List<Bookstore> getAllBooks() {
        return bookstoreRepo.findAll();
    }
   @Override
    public List<Bookstore> getGenreDetails(String genre)
    {
       return bookstoreRepo.findByGenre(genre);
    }

    @Override
    public List<Bookstore> getPublisherDetails(String publisher)
    {
        return bookstoreRepo.findByPublisher(publisher);
    }

    @Override
    public List<Bookstore> topSellers(List<Bookstore> books)
    {
        return books.stream().sorted(Comparator.comparingInt(Bookstore::getCopiesSold).reversed()).limit(10).collect(Collectors.toList());
    }

    public List<Bookstore> getBooksByRatings(List<Bookstore> books, double minRating)
    {
        return books.stream().filter(bookstore -> bookstore.getRating() >= minRating).collect(Collectors.toList());
    }
@Transactional
    public void discountBooksByPublisher(List<Bookstore> books, String publisher, double discountPercentage)
    {
        for(Bookstore book : books)
        {
            if(book.getPublisher().equalsIgnoreCase(publisher)){
                double originalPrice = book.getPrice();
                double discountPrice = originalPrice * (1 - discountPercentage/100);
                book.setPrice(discountPrice);
                bookstoreRepo.save(book);

                System.out.print("Discounting book with publisher " + book.getPublisher() + ": Original Price: " + originalPrice + " Discounted Price: " + discountPrice);
            }
        }
    }
}
