package com.phoenix.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;

/*
 * @author md.faisal
 * @creation date 07-10-2021
 * @version 1.0
 * @copyright sterlite technology
 * @description it is used to perform
 *  database operations using hibernate framework
 */

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create configuration object and read hibernate configuration
		Configuration cfg = new Configuration().configure();
		
		//Build session factory(Singleton & HeavyWeight
		SessionFactory factor=cfg.buildSessionFactory();
		
		//Established database connection
		Session ss = factor.openSession();
		
		//Obtain Hibernate Transaction
		Transaction tx = ss.beginTransaction();
		
		//code for database operation
		//Get datbase  row as an object
		//Product product = ss.get(Product.class, 3001);
		//System.out.println(product);
		
		//insert an object as a new row
		//Product p = new Product(5605, "Led Tv", "Oppo", 15000.00f);
		//ss.save(p);
		//Product p =ss.load(Product.class, 5605);Object not found exception
		/*Product p =ss.load(Product.class, 5605);
		System.out.println("Product Id: "+p.getProductId());
		System.out.println("Name: "+p.getProductName());
		System.out.println("Brand: "+p.getBrand());
		System.out.println("Price: "+p.getPrice());*/
		
		//update row price using an object
		/*Product p = ss.get(Product.class, 5605);
		if(p!=null) {
			p.setPrice(p.getPrice()+3000.00f);
			p.setBrand("Redmi");
			ss.update(p);
		}else
			System.out.println("Sorry! product not found");
		p = ss.get(Product.class, 5605);
		if(p!=null) {
			System.out.println(p);
			ss.update(p);
		}else
			System.out.println("Sorry! product not found");*/
		/*Product p =ss.get(Product.class, 5605);
		if(p!=null) {
			ss.delete(p);
		}else
			System.out.println("Sorry! product not found");*/
		
		Product p = new Product();
		p.setProductName("Desktop Computer");
		p.setBrand("Dell");
		p.setPrice(52500.00f);
		ss.save(p);
		
		//commit transaction
		tx.commit();
		
		//close session(database connection)
		ss.close();
	}

}
