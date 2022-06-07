package me.rallings.javaday25crud_db.service;

import me.rallings.javaday25crud_db.model.User;
import me.rallings.javaday25crud_db.web.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
