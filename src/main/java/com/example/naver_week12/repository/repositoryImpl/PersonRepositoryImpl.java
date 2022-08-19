package com.example.naver_week12.repository.repositoryImpl;

import com.example.naver_week12.model.Person;
import com.example.naver_week12.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    private static final List<Person> personList = new ArrayList<Person>();

    static {
        personList.add(new Person("1","Nguyễn Văn A",52,"Đánh cờ"));
        personList.add(new Person("2","Lê Thị B",68,"Thêu thùa"));
        personList.add(new Person("3","Đỗ Ngọc C",24,"Bóng rổ"));
        personList.add(new Person("4","Hồ Hoàng D",35,"Đua xe"));
        personList.add(new Person("5","Lương Văn E",19,"Chơi game"));
        personList.add(new Person("6","Trần Ngọc G",16,"Mua sắm"));
        personList.add(new Person("7","Đinh Hồng H",41,"Đánh đàn"));
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
