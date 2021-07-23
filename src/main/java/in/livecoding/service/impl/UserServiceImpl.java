package in.livecoding.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.livecoding.entity.User;
import in.livecoding.entity.UserRole;
import in.livecoding.repository.RoleRepository;
import in.livecoding.repository.UserRepository;
import in.livecoding.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRrepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	

	public User createUser(User user, Set<UserRole> userRoles)throws Exception {
		User local=this.userRrepository.findByUserName(user.getUserName());
		if(local!=null) {
			System.out.println("user already existt");
			throw new Exception("User Exists");
		}
		else {
			for(UserRole ur: userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			 local =this.userRrepository.save(user);
		}
		return local;
	}



	@Override
	public User getUser(String username) {
		
		
		return this.userRrepository.findByUserName(username);
	}



	@Override
	public void deleteUser(Long userId) {
		
		this.userRrepository.deleteById(userId);
	}
	
	

	

} 
