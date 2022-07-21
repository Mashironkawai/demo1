package com.ma2.admin;

import com.ma2.admin.bean.User;
import com.ma2.admin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.jws.soap.SOAPBinding;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Demo02ApplicationTests {

    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM account", long.class);
        log.info("记录总数:{}",aLong);
        log.info("数据源信息:{}",dataSource.getClass());
    }

    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息:{}",user);
    }


}
