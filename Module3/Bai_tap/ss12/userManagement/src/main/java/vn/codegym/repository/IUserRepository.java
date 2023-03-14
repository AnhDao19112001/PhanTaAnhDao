package vn.codegym.repository;

import vn.codegym.model.User;

import java.util.List;

public interface IUserRepository {
    void add (User user);
    User findById (int id);
    List<User> listAll (String countryName);
    List<User> findByCountry(String country);
    List<User> sortByName();
    void delete (User user);
    void update (User user);
    void addUserTransaction(User user, int[] permision);
}
