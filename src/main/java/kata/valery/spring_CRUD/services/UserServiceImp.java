package kata.valery.spring_CRUD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kata.valery.spring_CRUD.dao.UserDao;
import kata.valery.spring_CRUD.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Override
   public void create(User user) {
      userDao.add(user);
   }

   @Override
   public User get(long id) {
      return userDao.get(id);
   }

   @Override
   public void update(User user) {
       userDao.update(user);
   }

   @Override
   public void delete(User user) {
      userDao.delete(user);
   }

   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }
}
