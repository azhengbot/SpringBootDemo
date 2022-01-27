package com.example.springboot_demo.mapper;

import com.example.springboot_demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
//    @Select("SELECT * FROM USER WHERE NAME = #{name}")
//    User findByName(@Param("name") String name);

//    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
//    int insert(@Param("name") String name, @Param("age") Integer age);

//    @Select("SELECT id,name,age FROM USER")
    User[] getList();

    User getInstance(long id);

    void addInstance(User user);

    void updateInstance(User user);
}
