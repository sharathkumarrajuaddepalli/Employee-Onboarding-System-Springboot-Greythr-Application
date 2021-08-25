package com.lister.greytdb.greytdbstore.repository;

import com.lister.greytdb.greytdbstore.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {
}
