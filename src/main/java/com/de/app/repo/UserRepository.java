package com.de.app.repo;

import com.de.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value  = "SELECT u from User u WHERE u.name=?1")
    List<User> findByName(String name);

    @Query(value  = "SELECT * from users WHERE user_name=?",nativeQuery = true)
    List<User> findDetailsByName(String name);

    List<User> findByNameIgnoreCaseIn(List<String> username);

    List<User> findByNameContaining(String username);

    User findByEmail(String email);

    Optional<User> findByEmailIgnoreCase(String email);

    List<User> findByNameOrEmail(String username, String email);

    List<User> findByNameOrderByIdDesc(String name);

    List<User> findByNameOrderByIdAsc(String name);

}