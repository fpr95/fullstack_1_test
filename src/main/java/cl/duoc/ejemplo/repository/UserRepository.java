package cl.duoc.ejemplo.repository;

import cl.duoc.ejemplo.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository(){
        users = new ArrayList<>();

        User u1 = new User("John", 30, "fhgrth");
        User u2 = new User("Paul", 30, "fghh");
        User u3 = new User("George", 30, "rfgh");
        User u4 = new User("Ringo", 30, "fgh");

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
    }


    public void saveUser(User u){
        users.add(u);
    }

    public List<User> showUsers(){
        return users;
    }


}
