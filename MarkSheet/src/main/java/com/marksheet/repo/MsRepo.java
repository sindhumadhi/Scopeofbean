package com.marksheet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marksheet.MarkSheet;

public interface MsRepo extends JpaRepository<MarkSheet, Integer>
{

}
