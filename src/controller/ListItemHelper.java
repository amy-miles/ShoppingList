package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListItem;

public class ListItemHelper {
	
	//create global instance of EntityManagerFactory
	static
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ShoppingList");
	
	//method to accept a ListItem to add
	public void insertItem(ListItem li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	
	
}
