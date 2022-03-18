package org.db.soft.base.server;

import org.db.soft.base.dao.PersonDAO;
import org.db.soft.base.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

/**
 * xml: <bean id="server" class="org.db.soft.base.server.Server"></bean>
 */
@Service("server")
public class Server {

    @Autowired // 通过byName，byType的方式给你注入，如果出现异常
    @Qualifier("personDao") // 如果@Autowired注入出现异常则直接注入persondao
    private PersonDAO personDAO;

    public void operationPersonSever(Person person){
        String value = personDAO.sayHello( person );
        System.out.println(value);
    }
}
