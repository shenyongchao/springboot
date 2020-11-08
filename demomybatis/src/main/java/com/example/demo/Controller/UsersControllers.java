package com.example.demo.Controller;

import com.example.demo.pojo.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersControllers {
    @Autowired
    private UsersService usersService;


    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }


    @RequestMapping("/addUser")
    public  String addUser(Users users){
        this.usersService.addUser(users);
        return "OK";
    }

    @RequestMapping("/showusers")
    public String findUserAll(Model model){

        List<Users> list =this.usersService.selectUsersAll();
        model.addAttribute("list",list);

        return "showUsers";

    }

    @RequestMapping("/findUserByid")
    public String findUserByid(Integer id,Model model){

        Users user=this.usersService.findUserByid(id);
        model.addAttribute("user",user);
        return "updateuser";

    }

    @RequestMapping("/editUser")
    public  String editUser(Users users){
        this.usersService.updateUser(users);
        return "ok";
    }

    @RequestMapping("/delete")
    public  String deleteByid(Integer id){
        this.usersService.DeleteUserByid(id);
        return "redirect:/users/showusers";

    }



}
