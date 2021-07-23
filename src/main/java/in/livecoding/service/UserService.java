package in.livecoding.service;

import java.util.Set;

import in.livecoding.entity.User;
import in.livecoding.entity.UserRole;

public interface UserService {
 //create user having role
	public User createUser(User user,Set<UserRole> userRoles)throws Exception;
	public User getUser(String username);
	public void deleteUser(Long userId);
	
	
}
