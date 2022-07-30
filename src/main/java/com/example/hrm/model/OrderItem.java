package com.example.hrm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {
    @EmbeddedId
    public OrderCompoKey orderCompoKey;
    public Integer OrderQuantity;

}
