package com.revature.model;

import java.util.Objects;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(){
    }
    public User(int id, String username, String password, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    //right click - Generate Getters and Setters for above properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Override toString(), equals(), and hashcode() from Object class
    //right click - Generate .toString() for all properties
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //right click - Generate .equals() and Hashcode()

    @Override
    public boolean equals(Object o) {  //method to compare 2 different objects
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {  //useful for HashMaps and HashSets, those various different collections that require hashing
        return Objects.hash(id, username, password, email);
    }
}
