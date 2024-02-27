package com.example.campus.service;

import com.example.campus.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAllUser();
    public String getUserById();
    public String getUserByUserName();
    public String getUserByNic();
    public String createUser();
    public String updateUser();
    public String deleteUser();

}
