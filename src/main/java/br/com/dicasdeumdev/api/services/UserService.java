package br.com.dicasdeumdev.api.services;

import br.com.dicasdeumdev.api.domain.Users;
import br.com.dicasdeumdev.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    Users findById(Integer id);
    List<Users> findAll();
    Users create(UserDTO obj);
    Users update(UserDTO obj);
    void delete(Integer id);
}
