package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User showUser(long id);

    void update(long id, User user);

    void delete(long id);
}
