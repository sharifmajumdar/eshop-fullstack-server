package com.rest_api.fs14backend.user;
    import com.rest_api.fs14backend.exceptions.NotFoundException;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.UUID;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable UUID id) {
        User user = userService.findById(id);

        if (user == null) {
            throw new NotFoundException("Todo not found");
        }
        return user;
    }

    @PostMapping("/")
    public User createOne(@RequestBody User user) {
        return userService.createOne(user);
    }

    @DeleteMapping("/id/{id}")
    public void deleteOne(@PathVariable UUID id) {
        userService.deleteById(id);
    }

}