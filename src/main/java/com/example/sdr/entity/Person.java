package com.example.sdr.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "personIdSequence")
    @SequenceGenerator(name="personIdSequence", sequenceName="person_id_seq")
    private Long id;
    
    private String firstName;
    private String lastName;
    
    @OneToMany(mappedBy = "person")
    private List<Address> addresses;
    
    @OneToMany(mappedBy = "person")
    private List<Bookmark> bookmarks;

}
