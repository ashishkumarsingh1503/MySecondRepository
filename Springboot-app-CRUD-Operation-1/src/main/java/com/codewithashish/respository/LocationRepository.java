package com.codewithashish.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithashish.entity.Location;

public interface LocationRepository extends JpaRepository<Location , Integer> {

}
