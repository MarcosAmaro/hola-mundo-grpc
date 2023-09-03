package com.grpc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grpc.demo.model.Region;

@Repository
public interface IRegionRepository extends JpaRepository<Region, Long>{

}
