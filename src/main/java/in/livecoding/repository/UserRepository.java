package in.livecoding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.livecoding.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserName(String username);
	
	

}
