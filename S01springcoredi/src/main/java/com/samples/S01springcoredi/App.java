package com.samples.S01springcoredi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
       
      // Employee emp = (Employee) springContainer.getBean("emp"); 
      // System.out.println(emp);
       
    //Hospital hospital = (Hospital) springContainer.getBean("hospital"); 
      //  System.out.println(hospital);
       
       //CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
       //System.out.println(dealer);
       
      // Customer customer = (Customer) springContainer.getBean("customer");
      // System.out.println(customer);
       
       ShoppingCart shoppingcart = (ShoppingCart) springContainer.getBean("shoppingcart");
       System.out.println(shoppingcart);
    }
}
