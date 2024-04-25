package com.dolsoft.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dolsoft.football.model.Team;

@Repository
public  interface TeamRepository extends CrudRepository<Team, Long>{
public List<Team> findById(String Id);
}

