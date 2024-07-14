package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity //consider the class as entity
@Table(name = "product") //table name that we want to create in the database
public class ProductEntity {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //key is generated automatically
    private Integer productId;

    private String name;
    private String description;
    private String price;
    private String category;
    private boolean isActive; //by default this is false

}
