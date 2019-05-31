package com.system.restaurant.repository;

import com.system.restaurant.domain.User;

import java.util.ArrayList;

public interface UserRepository {
    ArrayList<User> userList();

    User findById(int id);

    int post(User userData);

    int put(User userData);

    int delete(int user_id);
}
