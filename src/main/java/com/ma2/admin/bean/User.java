package com.ma2.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @TableField(exist = false)
    public String userName;
    @TableField(exist = false)
    public String password;

    private long id;
    private String name;
    private Integer age;
    private String email;
}
