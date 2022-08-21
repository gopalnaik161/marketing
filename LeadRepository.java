package com.marketing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
