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

@Entity
@Data
@Table(name = "bookmarks")
public class Bookmark
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "bookmarksIdSequence")
    @SequenceGenerator(name="bookmarksIdSequence", sequenceName="bookmarks_id_seq")
    private Long id;
    
    private String name;
    private String url;
    private String description;
    
    @ManyToOne
    @RestResource(exported = false, path = "bookmarks", rel = "bookmarks")
    private Person person;
}
