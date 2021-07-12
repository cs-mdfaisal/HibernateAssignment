package com.phoenix.hibernate.main;
/*
 * @author md.faisal
 * @creation date 08-10-2021
 * @version 1.0
 * @copyright sterlite technology
 * @description it is used to perform
 *  database operations using JPQL
 */

import javax.persistence.Query;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;



public class JPQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Hibernate Query using JPQL- Oject Oriented Query Language
		//works on persistent class and its attributes only
		//does not understand table and column names
		
		//Query query = session.createQuery("from Product");
		//Query query = session.createQuery("from Product p where p.price>=4400.00");
		//Query query = session.createQuery("from Product p where p.brand='Dell'");
		//Query query = session.createQuery("from Product p where p.productName='laptop'");
		//Query query = session.createQuery("from Product p where p.brand='Dell' and p.brand='hp'");
		//Query query = session.createQuery("from Product p where p.price between 2000.00 and 50000.00");
		//Query query = session.createQuery("from Product p where p.productName like 'l%' ");
		//Query query = session.createQuery("from Product p where p.productName like '_a%' ");
		//Query query = session.createQuery("from Product p where p.brand is null");
		//Query query = session.createQuery("from Product p where p.brand is not null");
		//Query query = session.createQuery("from Product p order by p.price");
		//Query query = session.createQuery("from Product p order by p.price desc");
		//Query query = session.createQuery("from Product p order by p.productName,p.price desc");
		//Query query = session.createQuery("from Product p where p.price<=50000.00 order by p.price");
		//Query query = session.createQuery("from Product p where p.price<=50000.00 and p.brand like '%a%' order by p.price desc");
		
		
		/*
		 * List<Product> productList = query.getResultList(); for(Product
		 * product:productList) System.out.println(product);
		 */
		
		//projection-selecting particular fields(columns) in JPQL
		//Query query=session.createQuery("select p.productName,p.price from Product p");
		//Query query=session.createQuery("select p.productName,p.brand,p.price from Product p");
		//Query query=session.createQuery("select p.id,p.productName,p.price from Product p where p.price>50000.00 and p.price<70000.000");
		//Query query=session.createQuery("select p.productId,p.productName,p.price from Product p where p.price>50000.00 and p.price<70000.00 order by p.productName");
		
		/*
		 * List<Object[]> objList = query.getResultList(); for(Object[]obArr:objList) {
		 * //System.out.println("Product Name: "+ obArr[0] + "\tPrice: "+obArr[1]);
		 * for(Object ob:obArr) { System.out.print(ob+ "\t"); } System.out.println(); }
		 */
		//Query query = session.createQuery("select max(p.price) from Product p");
		//Query query = session.createQuery("select min(p.price) from Product p");
		//float Price = (float) query.getSingleResult();
		//System.out.println("Resultant Price: "+Price);

		/*Query query1 = session.createQuery("select sum(p.price) from Product p");
		double totalPrice = (double) query1.getSingleResult();
		System.out.println("Total Price: "+totalPrice);
		
		Query query2 = session.createQuery("select avg(p.price) from Product p");
		double avgPrice = (double) query2.getSingleResult();
		System.out.println("Average Price: "+avgPrice);*/
		
		//Query query = session.createQuery("select p.brand,count(*) from Product p group by p.brand");
		//Query query = session.createQuery("select p.brand,count(*) from Product p group by p.brand order by p.brand");
		//Query query = session.createQuery("select p.brand,count(*) as c from Product p group by p.brand order by c");
		Query query = session.createQuery("select p.brand,count(*) as c from Product p group by p.brand having p.brand like '%a%' order by c");
		
		List<Object[]> objList = query.getResultList();
		for(Object obArr[]:objList) {
			for(Object ob:obArr) {
				System.out.print(ob+"\t");
			}
			System.out.println();
		}
		
		tx.commit();
		session.close();
		
		
	}

}
