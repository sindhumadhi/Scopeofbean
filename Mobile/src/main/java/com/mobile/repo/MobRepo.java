package com.mobile.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.Mobile;

public interface MobRepo extends JpaRepository<Mobile, Integer>
{

}
