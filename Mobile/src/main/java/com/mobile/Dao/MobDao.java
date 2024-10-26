package com.mobile.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobile.Mobile;
import com.mobile.repo.MobRepo;

@Repository
public class MobDao {
	
@Autowired
MobRepo mr;

public List<Mobile> post(List<Mobile> m)
{
	mr.saveAll(m);
	return m;
}
}
