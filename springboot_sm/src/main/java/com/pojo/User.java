package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Integer id;
    private String user_Name;
    private String password;
    private int age;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}