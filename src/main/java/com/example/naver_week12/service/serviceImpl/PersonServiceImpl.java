package com.example.naver_week12.service.serviceImpl;

import com.example.naver_week12.model.Person;
import com.example.naver_week12.repository.PersonRepository;
import com.example.naver_week12.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
       this.personRepository = personRepository;
    }

    @Override
    public List<Person> getPersonList() {
        List<Person> listPersonSortByAgeDecrease = personRepository.getPersonList().stream()
                .sorted(Comparator
                        .comparingInt(Person::getAge)
                        .reversed())
                .collect(Collectors.toList());
        return listPersonSortByAgeDecrease;
    }

    @Override
    public Person getPersonById(String Id) {
        for (Person p : personRepository.getPersonList()) {
            if (Id.equals(p.getId()))
                return p;
        }
        return null;
    }
}
