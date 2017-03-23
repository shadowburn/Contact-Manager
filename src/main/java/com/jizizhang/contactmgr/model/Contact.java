package com.jizizhang.contactmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by CalvinZhang on 2017-03-22.
 */
@Entity
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;

  @Column
  private Long phone;

  //Defalt Constructor for JPA
  public Contact(){}

  public Contact(ContactBuilder builder){
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.phone = builder.phone;
  }

  public static class ContactBuilder{
    private String firstName;
    private String lastName;
    private String email;
    private Long phone;

    public ContactBuilder(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public ContactBuilder withEmail(String email){
      this.email = email;
      return this;
    }

    public ContactBuilder withPhone(Long phone){
      this.phone = phone;
      return this;
    }

    public Contact build(){
      return new Contact(this);
    }
  }

  @Override
  public String toString() {
    return "Contact{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", phone=" + phone +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }
}
