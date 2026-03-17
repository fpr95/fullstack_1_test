package cl.duoc.ejemplo.repository;

import cl.duoc.ejemplo.model.User;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository {

    private List<User> users;

    public UserRepository(){
        users = new ArrayList<>();

        users.add(new User("John", 30, "a@lol.com"));
        users.add(new User("Paul", 30, "b@lol.com"));
        users.add(new User("George", 30, "c@lol.com"));
        users.add(new User("Ringo", 30, "d@lol.com"));
        System.out.println(users);
    }

    public User saveAndReturnUser(User u){
        users.add(u);
        return u;
    }

    public List<User> showUsers(){
        return users;
    }

    public void saveUser(User u){
        users.add(u);
    }

    public User buscarUsuario(String correo){
        for(User u:users){
            if(Objects.equals(correo, u.getMail())){
                return u;
            }
        }
        return null;
    }

    public void deleteUser(User u){
        users.remove(u);
    }


}
