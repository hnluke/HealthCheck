package com.dao;

import com.model.pojo.Person;

import java.util.List;

public interface PersonMapper {

    public List<Person> findPerson(String cardNos);
}
