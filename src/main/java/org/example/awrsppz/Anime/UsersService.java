package org.example.awrsppz.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;
    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }
    public Users getUserById(int id) {
        return usersRepository.findById(id).orElse(null);
    }
    public Users addUser(Users user) {
        return usersRepository.save(user);
    }
}
