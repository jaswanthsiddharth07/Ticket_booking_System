package snippet;

public class Snippet {
	<?xml version='1.0' encoding='UTF-8'?>  
	<!DOCTYPE hibernate-configuration PUBLIC  
	          "-//Hibernate/Hibernate Configuration DTD 5.3//EN"  
	          "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">  
	  
	<hibernate-configuration>  
	  
	    <session-factory>  
	        <property name="hbm2ddl.auto">update</property>  
	        <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>  
	        <property name="connection.url">jdbc:mysql://localhost:3306/test_tktbooking</property>  
	        <property name="connection.username">root</property>  
	        <property name="connection.password">root</property>  
	        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
	        
	    	<mapping resource="user.hbm.xml"/> 
	    </session-factory>  
	  
	</hibernate-configuration> 
}

