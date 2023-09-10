package controller;

import java.util.List;

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
	
	//method to show all items in the DB
	public List<ListItem> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<ListItem> allItems = em.createQuery("SELECT i FROM ListItem i").getResultList();
		//to return one item (need to add a where clause)
		//ListItem oneItem = em.createQuery("SELECT i FROM ListItem i").getSingleResult();
		return allItems;
	}
	
	
}
