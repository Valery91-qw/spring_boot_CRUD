package kata.valery.spring_CRUD.dao;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import kata.valery.spring_CRUD.models.User;

import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Transactional
   @Override
   public void add(User user) {
      entityManager.persist(user);
      entityManager.flush();
   }

   @Override
   public User get(Long id) {
      User user = entityManager.find(User.class, id);
      entityManager.flush();
      return user;
   }

   @Override
   public void update(User user) {
      entityManager.merge(user);
      entityManager.flush();
   }

   @Override
   public void delete(User user) {
      user = entityManager.merge(user);
      entityManager.remove(user);
      entityManager.flush();
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      List<User> users = entityManager.createQuery("from User").getResultList();
      entityManager.flush();
      return users;
   }

}
