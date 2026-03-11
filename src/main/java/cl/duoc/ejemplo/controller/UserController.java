package cl.duoc.ejemplo.controller;

import cl.duoc.ejemplo.model.User;
import cl.duoc.ejemplo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository repository;

    public UserController() {
        repository = new UserRepository();
    }

    @GetMapping
    public String test() {
        return "Hola Mundo";
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return repository.showUsers();
    }

}
