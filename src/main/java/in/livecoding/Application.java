package in.livecoding;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import in.livecoding.entity.Role;
import in.livecoding.entity.User;
import in.livecoding.entity.UserRole;
import in.livecoding.service.UserService;

@SpringBootApplication(exclude=ErrorMvcAutoConfiguration.class)
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner{
    
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting......");
		User user=new User();
		user.setFirstName("Mohammad");
		user.setLastName("Juned");
		user.setUserName("juned@shaki");
        user.setEmail("juned@habeeb.com");
        user.setPassword("shaki@123");
        
        Role role1=new Role();
        role1.setRoleId(44L);
        role1.setRoleName("Admin");
        
        Set<UserRole> userRoleSet=new HashSet<>();
       UserRole  userRole=new UserRole();
     //  userRole.setUserRoleId(userRoleId);
       userRole.setRole(role1);
       userRole.setUser(user);
       userRoleSet.add(userRole);
       //this.
       User user1=userService.createUser(user, userRoleSet);
       System.out.println("User added: "+user1.getFirstName());
       
	}

}
