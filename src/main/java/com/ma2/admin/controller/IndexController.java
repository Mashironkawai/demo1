package com.ma2.admin.controller;

import com.ma2.admin.bean.User;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 */
@Controller
public class IndexController {

    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFormDb(){
        Long aLong = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM account", long.class);
        return aLong.toString();
    }

    @GetMapping(value = {"/login"})
    public String loginPage(){
        return "login";
    }


    @PostMapping("/login")
    public String main(User user, HttpSession session,Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())){
            //把登录成功的用户保存下来
            session.setAttribute("loginUser",user);
        return "redirect:/main.html";
        }else {
            model.addAttribute("msg","错误 ");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
//
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser != null){
//            return "main";
//        }else {
//            model.addAttribute("msgl", "请重新登录");
//            return "login";
//        }
        return "main";
    }
}
