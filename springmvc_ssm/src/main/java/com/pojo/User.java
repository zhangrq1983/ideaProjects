package com.pojo;

public class User {
    private Integer id;
 
    private String user_Name;
 
    private String password;
 
    private Integer age;
 
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

	public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "User [id=" + id + ", user_Name=" + user_Name + ", password=" + password + ", age=" + age + "]";
    }    
}
