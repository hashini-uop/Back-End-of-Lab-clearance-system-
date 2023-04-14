package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByEmailAndPassword(String email , String password);
   User findByEmail(String email);
//    Boolean existsByUsername(String username);
//    Boolean existsByEmail(String email);
}
