package com.techzone.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techzone.account.bo.SysResource;
import com.techzone.account.dao.ResourceDao;
import com.techzone.account.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceDao resourceDao;
	
	@Override
	public List<SysResource> findAllResources() {
		return resourceDao.findAllResources();
	}

}
