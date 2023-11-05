package me.dio.santander.service;

import me.dio.santander.domain.model.User;

import java.util.Optional;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);

}
