package vn.codegym.service;

import vn.codegym.model.User;

import java.util.List;

public interface IUserService {
    void add (User user);
    User findById (int id);
    List<User> listAll (String country);
    void delete (User user);
    void update (User user);
    List<User> findByCountry(String name);

    List<User> sortByName();
}
