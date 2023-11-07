package bookstore.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.main.entity.User;
import bookstore.main.repository.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User saveDetails(User user){
        
        return userRepository.save(user);
    }

    public User getUserDetails (String username){

        return userRepository.findByUsername(username);
    }

    public User updateUser (String username, User updatedUser){
        
        User existingUser = userRepository.findByUsername(username);

        if (existingUser != null) {

            if (updatedUser.getPassword() != null) {
                existingUser.setPassword(updatedUser.getPassword());
            }

            if (updatedUser.getFirstName() != null) {
                existingUser.setFirstName(updatedUser.getFirstName());
            }

            if (updatedUser.getLastName() != null) {
                existingUser.setLastName(updatedUser.getLastName());
            }

            if (updatedUser.getAddress() != null) {
                existingUser.setAddress(updatedUser.getAddress());
            }

            return userRepository.save(existingUser);

        } else {

            return null;
        }
    }
}