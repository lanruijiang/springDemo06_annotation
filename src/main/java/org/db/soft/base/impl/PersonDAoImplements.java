package org.db.soft.base.impl;

import org.db.soft.base.dao.PersonDAO;
import org.db.soft.base.model.Person;
import org.springframework.stereotype.Controller;

/**
 * xml:<bean id="personDao" class="org.db.soft.base.impl.PersonDAoImplements"></bean>
 */
@Controller("personDao")
public class PersonDAoImplements implements PersonDAO {
    @Override
    public String sayHello(Person person) {
        int personId = person.getPersonId();
        String personName = person.getPersonName();
        int personAge = person.getPersonAge();
        String value = "I am  NO." + personId+ " my name is " + personName+" I am " + personAge+" years old .";
        return value;
    }
}
