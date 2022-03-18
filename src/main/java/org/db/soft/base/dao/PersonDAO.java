package org.db.soft.base.dao;

import org.db.soft.base.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface PersonDAO {
    public String sayHello(Person person);
}
