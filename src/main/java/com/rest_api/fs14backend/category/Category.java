package com.rest_api.fs14backend.category;


import com.rest_api.fs14backend.status.Status;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "category")
@Table(name = "category")
@Data
@NoArgsConstructor
public class Category {
  @Id
  @GeneratedValue
  @UuidGenerator
  private UUID id;

  @Column(unique = true, nullable = false)
  private String name;
  private Status status;

  public Category(String name) {
    this.name = name;
  }
}
