package kata.valery.spring_CRUD.dao;

import java.util.List;

import kata.valery.spring_CRUD.models.User;

public interface UserDao {
   void add(User user);
   User get(Long id);
   void update(User user);
   void delete(User user);
   List<User> listUsers();
}
