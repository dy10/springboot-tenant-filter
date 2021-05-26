package com.example.filter.rest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NonFilterEntityRepo extends JpaRepository<NonFilterEntity, Long> {

}
