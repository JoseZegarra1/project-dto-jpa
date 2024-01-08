package com.jos3zy.projectdtojpa.repository;

import com.jos3zy.projectdtojpa.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
}
