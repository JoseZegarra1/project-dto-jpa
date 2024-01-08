package com.jos3zy.projectdtojpa.repository;

import com.jos3zy.projectdtojpa.dto.open.LocalOpenView;
import com.jos3zy.projectdtojpa.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {

    List<LocalOpenView> findBy();

}
