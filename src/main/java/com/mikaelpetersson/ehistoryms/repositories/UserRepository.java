package com.mikaelpetersson.ehistoryms.repositories;

import com.mikaelpetersson.ehistoryms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
