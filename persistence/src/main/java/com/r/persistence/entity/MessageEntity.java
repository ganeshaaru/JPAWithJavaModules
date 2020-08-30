package com.r.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Message")
public class MessageEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "Text")
  private String text;

  public MessageEntity() {
      // Default Constructor
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MessageEntity that = (MessageEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text);
  }
}
