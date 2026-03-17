package cl.duoc.ejemplo.controller;

import cl.duoc.ejemplo.model.User;
import cl.duoc.ejemplo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository repository;

    public UserController() {
        repository = new UserRepository();
    }

    @GetMapping("")
    public String test() {
        return "Hola Mundo";
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return repository.showUsers();
    }

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User u){
        repository.saveUser(u);
        return u;
    }

    @DeleteMapping("/user")
    public void borrarUsuario(@RequestParam("correo") String correo){
        User u = repository.buscarUsuario(correo);
        if(u != null){
            repository.deleteUser(u);
        }
    }

    @GetMapping
    public User obtenerUsuario(@RequestParam("correo") String correo){
        return repository.buscarUsuario(correo);
    }
}
