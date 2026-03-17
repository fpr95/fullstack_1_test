package cl.duoc.ejemplo.model;

import lombok.*;

@Data
public class User {

    private String name;
    private int age;
    private String mail;

    public User(String name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
    }
}
