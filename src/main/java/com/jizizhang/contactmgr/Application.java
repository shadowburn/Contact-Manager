package com.jizizhang.contactmgr;

import com.jizizhang.contactmgr.model.Contact;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
//import javax.imageio.spi.ServiceRegistry;

/**
 * Created by CalvinZhang on 2017-03-22.
 */
public class Application {
  //hold a reusable reference to a SessionFactory
  //private static final SessionFactory sessionFactory = buildSessionFactory();

  private static SessionFactory buildSessionFactory(){
    //Create a StandardServiceRegistry
    final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    return new MetadataSources(registry).buildMetadata().buildSessionFactory();
  }

  public static void main(String[] args){
    Contact contact = new Contact.ContactBuilder("Jizi", "Zhang")
        .withEmail("zjzottawa@gmail.com")
        .withPhone(6138908678L)
        .build();

    System.out.println(contact);
  }

}
