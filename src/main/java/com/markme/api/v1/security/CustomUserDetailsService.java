package com.markme.api.v1.security;

import com.markme.api.v1.models.User;
import com.markme.api.v1.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Transactional
    public UserDetails loadByUserId(UUID id) {
        User user = this.userRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("User not found with id: "+id));
        return UserPrincipal.create(user);
    }

    @Transactional
    public UserDetails loadUserByUsername(String s) {
        User user = userRepository.findByEmail(s).orElseThrow(()-> new UsernameNotFoundException("user not found with email of "+s));
        return UserPrincipal.create(user);
    }
}
