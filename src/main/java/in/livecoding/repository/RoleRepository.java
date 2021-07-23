package in.livecoding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.livecoding.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	

}
