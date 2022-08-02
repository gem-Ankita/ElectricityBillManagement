package com.electricity.electricityBill.Repo;

import com.electricity.electricityBill.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {


}
