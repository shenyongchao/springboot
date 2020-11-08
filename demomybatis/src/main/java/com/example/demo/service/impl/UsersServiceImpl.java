package com.example.demo.service.impl;


import com.example.demo.mapper.UsersMapper;
import com.example.demo.pojo.Users;
import com.example.demo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
//@Transactional
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;


    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);


    }

    @Override
    public List<Users> selectUsersAll() {
        return this.usersMapper.selectUsersAll();
    }

    @Override
    public Users findUserByid(Integer id) {
        return this.usersMapper.selectUserByid(id);
    }

    @Override
    public void updateUser(Users users) {
         this.usersMapper.updateUser(users);
    }

    @Override
    public void DeleteUserByid(Integer id) {
        this.usersMapper.DeleteUserByid(id);
    }
}
