package com.example.demo.mapper;

import com.example.demo.pojo.Users;

import java.util.List;


public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUsersAll();

    Users selectUserByid(Integer id);

    void updateUser(Users users);

    void DeleteUserByid(Integer id);
}
