package bookstore.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookstore.main.entity.CreditCard;

@Repository 

public interface CreditCardRepository extends JpaRepository <CreditCard, Long> {

}