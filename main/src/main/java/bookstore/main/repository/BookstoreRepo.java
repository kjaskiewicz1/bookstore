package Bookstore.Bookstore.Repository;

import Bookstore.Bookstore.Entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookstoreRepo extends JpaRepository<Bookstore,String> {

    List<Bookstore> findByGenre(String genre);

    List<Bookstore> findByPublisher(String publisher);
}
