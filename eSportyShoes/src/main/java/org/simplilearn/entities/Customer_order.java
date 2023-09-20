package org.simplilearn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer_order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int oid;
@Temporal(TemporalType.TIMESTAMP)
   private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "uid") // Define the foreign key column
    private User user;

    // ...
}
