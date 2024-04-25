package com.dolsoft.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dolsoft.football.model.Players;

@Repository
public  interface PlayersRepository extends CrudRepository<Players, Long>{
public List<Players> findById(String Id);
}

