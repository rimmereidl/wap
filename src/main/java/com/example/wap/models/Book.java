package com.example.wap.models;
import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
  @Id
  private Integer ISBN;
  private String name;
  private String subject;
  private String publisher;
  private String publicationDate;
  private String authorId;

  public Integer getISBN() {
    return ISBN;
  }

  public void setISBN(Integer ISBN) {
    this.ISBN = ISBN;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }
}
