package com.niit.shoppingcart.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.niit.shoppingcart.model.User;

public class ApplicationContextConfig
{
	@Bean
	(name = "dataSource")
   public DataSource getDataSource() 
	{
			DriverManagerDataSource dataSource = new DriverManagerDataSource();

			dataSource.setDriverClassName("org.h2.Driver");

			dataSource.setUrl("jdbc:h2:mem:tmp.db;INIT=CREATE SCHEMA IF NOT EXISTS NIITDB");

			dataSource.setUsername("sa");
			dataSource.setPassword("sa");
			return dataSource;
	}
	
	private Properties getHibernateProperties()
	{
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	   properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    return properties;
	}
	
	@Autowired
    @Bean
    (name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) 
	{

       LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
       sessionBuilder.addProperties(getHibernateProperties());
      // sessionBuilder.addAnnotatedClasses(User.class); // Other domains
       return sessionBuilder.buildSessionFactory();
    }
	
	@Autowired
	@Bean
	(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
	  HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

	   return transactionManager;
	}

}
