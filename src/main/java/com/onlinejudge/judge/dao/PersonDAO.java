package com.onlinejudge.judge.dao;

import com.onlinejudge.judge.domain.Person;

public interface PersonDAO {

	public Person getPersonById(Long id);

	public void addPerson(Person person);

	public void deletePersonById(Long id);

	public void updatePerson(Person person);

}
