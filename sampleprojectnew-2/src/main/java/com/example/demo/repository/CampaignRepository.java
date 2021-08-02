package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Campaign;

public interface CampaignRepository extends CrudRepository<Campaign,String>{

}
