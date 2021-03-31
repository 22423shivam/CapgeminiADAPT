package io.springSecurity.springsecurityAssignment1Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springSecurity.springsecurityAssignment1Q4.Info.User;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUserByName(String username){
        return  userRepository.findByUsername(username).get();
    }

    public void increaseFailedAttempts(User user) {
        int newFailedAttemp = user.getFailedAttempt()+1;
        user.setFailedAttempt(newFailedAttemp);
        userRepository.save(user);
    }

    public void lock(User user) {
        user.setAccountNonLocked(false);
        user.setLockTime(new Date());
        userRepository.save(user);
    }
}