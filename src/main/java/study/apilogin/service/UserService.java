package study.apilogin.service;

import org.springframework.stereotype.Service;
import study.apilogin.entity.UserEntity;

import java.util.Optional;

@Service
public class UserService {

    private static final String EXISTING_EMAIL = "test@test.com";
    private static final String ANOTHER_EMAIL = "next@test.com";

    // UserEntity를 반환
    public Optional<UserEntity> findByEmail(String email) {
        // TODO : MOve this to a database
        if (EXISTING_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(1L);
            user.setEmail(EXISTING_EMAIL);
            user.setPassword("$2a$12$4a0hliCC5ngRk3ma58w6vu5RbOZS8MXYJ5vKQGDei8eualf2CLKAW");   // test
            user.setRole("ROLE_ADMIN");
            user.setExtraInfo("My nice admin");
            return Optional.of(user);
        } else if (ANOTHER_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(99L);
            user.setEmail(EXISTING_EMAIL);
            user.setPassword("$2a$12$4a0hliCC5ngRk3ma58w6vu5RbOZS8MXYJ5vKQGDei8eualf2CLKAW");   // test
            user.setRole("ROLE_USER");
            user.setExtraInfo("My nice user");
            return Optional.of(user);
        }else {
            return Optional.empty();
        }
    }
}
