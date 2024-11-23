package com.ldap.demo.service;

import com.ldap.demo.entity.Userdemo;
import com.ldap.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Userdemo> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Userdemo> getUserById(Integer iden) {
        return userRepository.findById(iden);
    }

    public Userdemo createUser(Userdemo user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer iden) {
        if (userRepository.existsById(iden)) {
            userRepository.deleteById(iden);
        } else {
            throw new RuntimeException("Book not found with id: " + iden);
        }
    }
}
