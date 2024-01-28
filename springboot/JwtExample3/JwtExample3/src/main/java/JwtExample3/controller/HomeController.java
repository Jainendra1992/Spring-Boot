package JwtExample3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JwtExample3.Services.UserService;
import JwtExample3.models.User;

import java.security.Principal;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    // http://localhost:8081/home/users
	
	@Autowired
	private UserService userService;
	
    @GetMapping("/users")
    public List<User> getUser()
    {
        System.out.println("getting users");
        return userService.getUsers();
    }
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal)
    {
    	return principal.getName();
    }
    
    
    
    
    
    
    
}
