package bookstore.main.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "CreditCard")

@NoArgsConstructor
@AllArgsConstructor

public class CreditCard {
    
    @Id
    @Column(name = "card_id")
    @GeneratedValue
    private Long cardId;
    
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @Column(name = "cardholder")
    private String cardholder;
  
    @Column(name = "card_number", unique = true)
    private String cardNumber;
  
    @Column(name = "expiry_date") 
    private LocalDate expiryDate;
  
    @Column(name = "cvv")
    private Integer cvv;
  
    @Column(name = "address")
    private String address;

}

