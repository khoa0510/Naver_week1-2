package com.example.naver_week12.service;

import com.example.naver_week12.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getPersonList();
    Person getPersonById(String Id);
}
