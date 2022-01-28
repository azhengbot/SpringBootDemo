package com.example.springboot_demo.domain.bill;


public class BillRecord {

  private long id;
  private double billAmount;
  private java.sql.Timestamp timeOfOccurrence;
  private long tagId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(double billAmount) {
    this.billAmount = billAmount;
  }


  public java.sql.Timestamp getTimeOfOccurrence() {
    return timeOfOccurrence;
  }

  public void setTimeOfOccurrence(java.sql.Timestamp timeOfOccurrence) {
    this.timeOfOccurrence = timeOfOccurrence;
  }


  public long getTagId() {
    return tagId;
  }

  public void setTagId(long tagId) {
    this.tagId = tagId;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAte() {
    return updatedAt;
  }

  public void setUpdatedAte(java.sql.Timestamp updatedAte) {
    this.updatedAt = updatedAte;
  }

}
