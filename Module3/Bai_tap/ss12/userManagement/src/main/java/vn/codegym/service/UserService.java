package vn.codegym.service;

import vn.codegym.model.User;
import vn.codegym.repository.IUserRepository;
import vn.codegym.repository.UserRepository;

import java.util.List;

public class UserService implements IUserService{
IUserRepository userRepository = new UserRepository();
    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> listAll(String country) {
        if (country == null){
            country = "";
        }
        return userRepository.listAll(country);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public List<User> findByCountry(String name) {
        return userRepository.findByCountry(name);
    }

    @Override
    public List<User> sortByName() {
        return userRepository.sortByName();
    }
}
