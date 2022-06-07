package me.rallings.javaday25crud_db.repository;

import me.rallings.javaday25crud_db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);

}
