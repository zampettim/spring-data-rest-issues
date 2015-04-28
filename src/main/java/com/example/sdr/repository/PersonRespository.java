package com.example.sdr.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.sdr.entity.Person;

public interface PersonRespository extends PagingAndSortingRepository<Person, Long>
{

}
