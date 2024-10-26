package com.results.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.results.Results;

public interface RRepo extends JpaRepository<Results, Integer>
{
 @Query(value = "select * from resulttab",nativeQuery = true)
	public List<Results> getAll();
}
