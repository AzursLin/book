package com.lxz.book.model;

import javax.persistence.*;

@Entity
@Table(name = "dish")
public class Dish {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private String name;
  private String url;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
