package com.learn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.model.Inventory;

@Repository
public class InventoryDAOImpl implements InventoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveInventory(Inventory theInventory) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theInventory);
	}

	/*
	 * @Override public Inventory getInventory(int theId) { Session currentSession =
	 * sessionFactory.getCurrentSession(); Inventory theInventory =
	 * currentSession.get(Inventory.class, theId); return theInventory; }
	 */

}
