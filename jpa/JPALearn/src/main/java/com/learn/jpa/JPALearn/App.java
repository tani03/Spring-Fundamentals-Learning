package com.learn.jpa.JPALearn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em= emf.createEntityManager();
        User user=em.find(User.class, 4);
        System.out.println(user.toString());
    }
}
 