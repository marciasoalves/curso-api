package br.com.dicasdeumdev.api.services.impl;

import br.com.dicasdeumdev.api.domain.Users;
import br.com.dicasdeumdev.api.repositories.UserRepository;
import br.com.dicasdeumdev.api.services.UserService;
import br.com.dicasdeumdev.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Users findById(Integer id) {
        Optional<Users>obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto Não Encontrado"));
    }
}
