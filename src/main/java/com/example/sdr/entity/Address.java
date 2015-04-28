package com.example.sdr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "addressIdSequence")
    @SequenceGenerator(name="addressIdSequence", sequenceName="address_id_seq")
    private Long id;
    
    private String number;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    
    @ManyToOne
    @RestResource(path = "addresses", rel = "addresses")
    private Person person;

}
