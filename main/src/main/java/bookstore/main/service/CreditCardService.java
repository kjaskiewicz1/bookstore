package bookstore.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.main.entity.CreditCard;
import bookstore.main.repository.CreditCardRepository;


@Service
public class CreditCardService {

    @Autowired

    private CreditCardRepository creditCardRepository;

    public CreditCard save(CreditCard creditCard){

        return creditCardRepository.save(creditCard);
    }

}

