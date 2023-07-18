package br.com.dicasdeumdev.api.services;

import br.com.dicasdeumdev.api.domain.Users;

public interface UserService {
    Users findById(Integer id);
}
