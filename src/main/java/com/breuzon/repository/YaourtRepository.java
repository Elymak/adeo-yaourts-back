package com.breuzon.repository;

import com.breuzon.entity.YaourtHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YaourtRepository extends CrudRepository<YaourtHistory, Long> {
    List<YaourtHistory> findAll();

    @Query("SELECT y FROM YaourtHistory y WHERE y.userId = :userId ORDER BY y.datetime DESC")
    List<YaourtHistory> findYaourtHistoryByUserIdOrderByDatetime(@Param("userId") int userId);

    @Query("SELECT y FROM YaourtHistory y WHERE y.userId = :userId AND y.datetime = (SELECT MAX(y2.datetime) FROM YaourtHistory y2 WHERE y2.userId = :userId)")
    YaourtHistory findTopByOrderByDatetimeDesc(@Param("userId") int userId);
}
