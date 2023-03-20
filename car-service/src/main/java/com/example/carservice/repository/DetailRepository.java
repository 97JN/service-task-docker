package com.example.carservice.repository;

import com.example.carservice.entity.DetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<DetailEntity, Integer> {
}
