package io.springSecurity.springsecurityAssignment1Q4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.springSecurity.springsecurityAssignment1Q4.Info.MyUserDetails;
import io.springSecurity.springsecurityAssignment1Q4.Info.User;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

@Autowired
UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User>user =userRepository.findByUsername(username);
        user.orElseThrow(()-> new UsernameNotFoundException("Not found"));

      return user.map(MyUserDetails::new).get();
    }


}
