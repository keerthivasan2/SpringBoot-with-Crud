package com.keerthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
