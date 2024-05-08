package kata.valery.spring_CRUD.services;

import java.util.List;

import kata.valery.spring_CRUD.models.User;

public interface UserService {
    void create(User user);
    User get(long id);
    void update(User user);
    void delete(User user);
    List<User> listUsers();
}
