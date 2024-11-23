package com.ldap.demo.repository;

import com.ldap.demo.entity.Userdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Userdemo, Integer> {

}