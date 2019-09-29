package com.hfs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hfs.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
