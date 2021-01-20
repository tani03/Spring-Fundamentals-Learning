package com.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.dao.InventoryDAO;
import com.learn.model.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryDAO inventoryDAO;
	
	@Override
	@Transactional
	public void saveInventory(Inventory theInventory) {
		inventoryDAO.saveInventory(theInventory);
	}

}
