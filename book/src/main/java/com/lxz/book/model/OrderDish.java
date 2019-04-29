package com.lxz.book.model;

import javax.persistence.*;

@Entity
@Table(name = "order_dish")
public class OrderDish {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private long orderId;
  private long dishId;
  private long number;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getDishId() {
    return dishId;
  }

  public void setDishId(long dishId) {
    this.dishId = dishId;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

}
