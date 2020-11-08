package com.example.demo.service;

import com.example.demo.pojo.Users;

import java.util.List;


public interface UsersService {

    void addUser(Users users);

    List<Users> selectUsersAll();

    Users findUserByid(Integer id);

    void updateUser(Users users);

    void DeleteUserByid(Integer id);

}


