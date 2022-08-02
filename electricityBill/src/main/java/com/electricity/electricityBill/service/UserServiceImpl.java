package com.electricity.electricityBill.service;

import com.electricity.electricityBill.Repo.UserRepo;
import com.electricity.electricityBill.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        User user1=this.userRepo.save(user);
        return user1;
    }
}
