package com.techzone.account.dao;

import java.util.List;

import com.techzone.account.bo.SysResource;

public interface ResourceDao {
	
	List<SysResource> findAllResources();

}
