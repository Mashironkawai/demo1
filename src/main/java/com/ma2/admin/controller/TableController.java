package com.ma2.admin.controller;

import com.ma2.admin.bean.User;
import com.ma2.admin.service.UserService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class TableController {

    @Autowired
    UserService userService;


    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }


    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){

        List<User> list = userService.list();

        model.addAttribute("users",list);

        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
}
