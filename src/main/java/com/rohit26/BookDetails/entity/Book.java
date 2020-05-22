package com.rohit26.BookDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  int id;
  String name;
  String description;
  String author;
  
  protected Book(){
    
  }
  
  public Book(int id, String name, String description, String author) {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
    this.author = author;
  }
  public int getId() {
  return id;}
  public void setId(int id) {
  this.id = id;}
  public String getName() {
  return name;}
  public void setName(String name) {
  this.name = name;}
  public String getDescription() {
  return description;}
  public void setDescription(String description) {
  this.description = description;}
  public String getAuthor() {
  return author;}
  public void setAuthor(String author) {
  this.author = author;}
  
}
