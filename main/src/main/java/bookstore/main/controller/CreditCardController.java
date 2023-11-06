package bookstore.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookstore.main.entity.CreditCard;
import bookstore.main.entity.User;
import bookstore.main.repository.UserRepository;
import bookstore.main.service.CreditCardService;

@RestController

public class CreditCardController {

    @Autowired

    private CreditCardService creditCardService;

    @Autowired

    private UserRepository userRepository;

    @PostMapping("/addCreditCard")
    public HttpStatus addCreditCardToUser(@RequestParam String username, @RequestBody CreditCard creditCard) {

        User user = userRepository.findByUsername(username);

        if (user != null) {

            creditCard.setUser(user);
            creditCardService.save(creditCard);

            return HttpStatus.CREATED;
        }

        return HttpStatus.BAD_REQUEST;
    }

}