package com.example.hrm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
    @Id
    public String custId ;
    public String custName;
    public String custAddress;
    public String custPhone;

}
