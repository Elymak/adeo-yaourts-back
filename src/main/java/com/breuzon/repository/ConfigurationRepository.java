package com.breuzon.repository;

import com.breuzon.entity.UserConfig;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfigurationRepository extends CrudRepository<UserConfig, Long> {
    @Query("SELECT u FROM UserConfig u WHERE u.userId = :userId")
    Optional<UserConfig> findByUserId(@Param("userId") Long userId);
}
