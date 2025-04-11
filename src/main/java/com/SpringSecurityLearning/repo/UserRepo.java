package com.SpringSecurityLearning.repo;

import com.SpringSecurityLearning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Integer> {


    User findByUserName(String userName);
}
