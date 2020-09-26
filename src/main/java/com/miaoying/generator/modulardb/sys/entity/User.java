package com.miaoying.generator.modulardb.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @auther CodeGenerator
 * @create 2020-08-12 22:28:22
 * @describe 实体类
 */
@TableName("user")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "主键ID")
                    @TableId(value = "id", type = IdType.UUID)
                private Long id;

        @ApiModelProperty(value = "姓名")
    @TableField("name")
        private String name;

        @ApiModelProperty(value = "年龄")
    @TableField("age")
        private Integer age;

        @ApiModelProperty(value = "邮箱")
    @TableField("email")
        private String email;


    public Long getId() {
            return id;
            }

        public User setId(Long id) {
            this.id = id;
                return this;
            }

    public String getName() {
            return name;
            }

        public User setName(String name) {
            this.name = name;
                return this;
            }

    public Integer getAge() {
            return age;
            }

        public User setAge(Integer age) {
            this.age = age;
                return this;
            }

    public String getEmail() {
            return email;
            }

        public User setEmail(String email) {
            this.email = email;
                return this;
            }

@Override
public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", email=" + email +
        "}";
        }
        }
