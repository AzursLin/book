package com.lxz.book.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private String orderId;
  private Long createTime;
  private String deskNumber;
  private Integer status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public String getDeskNumber() {
    return deskNumber;
  }

  public void setDeskNumber(String deskNumber) {
    this.deskNumber = deskNumber;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}
