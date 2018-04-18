package com.niit.backend.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

/**
 * DB Configuration details.
 * @author hp
 */
@Configuration
public class DBConfiguration {

	/**
	 * Database credentials details.
	 * @return
	 */
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/puppypawspet");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	/**
	 * Configuring the SessionFactory with the hibernate properties 
	 * To scan the model classes in the specified package.
	 * Dialect Property to convert the Hibernate query into navative DB query(oracle, h2 etc.)
	 * 
	 * @return
	 */
	@Bean(name="sessionFactory")
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder sessionBuilder=
				new LocalSessionFactoryBuilder(getDataSource());
		sessionBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		sessionBuilder.scanPackages("com.niit.backend.model");
		sessionBuilder.setProperty("hibernate.show_sql", "true");
		// create new table or update the records in te 
		sessionBuilder.setProperty("hibernate.hbm2ddl.auto", "update");
		/*
		SLT session
		Properties hibernateProperties=new Properties();
		Hibernate Dialect - used convert hibernate prop into h2 
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		sessionBuilder.addProperties(hibernateProperties);
		//An array of Class objects of all the entities
		//Map all entities to relational table
		
		Class classes[]=new Class[]{};
		//localsesionfactorybuilder -> sessionfactory -> map all entities with relation table
		 return sessionBuilder.addAnnotatedClasses(classes).buildSessionFactory();
	   */ 
		return sessionBuilder.buildSessionFactory();

	}
	
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransaction(){
		return new HibernateTransactionManager(sessionFactory());
	}
}
