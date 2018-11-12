package com.helixz.quartz.demo.repository;

import com.helixz.quartz.demo.enitiy.SchedulerJobInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Chamith
 */
@Repository
public interface SchedulerRepository extends JpaRepository<SchedulerJobInfo, Long> {

    @Query("select s from SchedulerJobInfo s where s.propertyKey = :propertyKey")
    SchedulerJobInfo findByPropertyKey(@Param("propertyKey") String propertyKey);

}
