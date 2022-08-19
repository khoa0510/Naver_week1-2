package com.example.naver_week12.service.serviceImpl;

import com.example.naver_week12.model.Person;
import com.example.naver_week12.repository.PersonRepository;
import com.example.naver_week12.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
       this.personRepository = personRepository;
    }

    @Override
    public List<Person> getPersonList() {
        List<Person> listPersonSortByAgeDecrease = new ArrayList<Person>();
        List<Person> listAllPerson = personRepository.getPersonList();
        while (listAllPerson.isEmpty()!=true) {
            Person oldestPerson = listAllPerson.get(0);
            for (Person p : listAllPerson) {
                if (p.getAge() > oldestPerson.getAge())
                    oldestPerson = p;
            }
            listPersonSortByAgeDecrease.add(new Person(oldestPerson));
            listAllPerson.remove(oldestPerson);
        }
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
