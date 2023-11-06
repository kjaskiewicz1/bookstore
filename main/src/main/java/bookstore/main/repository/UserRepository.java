package bookstore.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.main.entity.User;


public interface UserRepository extends JpaRepository <User, Long> {
    
    User findByUsername(String username);
}
