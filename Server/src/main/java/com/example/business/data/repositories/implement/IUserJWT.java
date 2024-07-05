package com.example.business.data.repositories.implement;

import org.springframework.stereotype.Repository;

import com.example.business.data.entities.UserJWT;
import com.example.business.data.repositories.IBaseRepository;

@Repository
public interface IUserJWT extends IBaseRepository<UserJWT, String> {
    
}
