package com.example.hrm.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class OrderCompoKey implements Serializable {
    @ManyToOne
   public CustomerOrder customerOrder;
    @ManyToOne
   public Product product;

}
