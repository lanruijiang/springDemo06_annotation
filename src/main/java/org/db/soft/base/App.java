package org.db.soft.base;

import org.db.soft.base.model.Person;
import org.db.soft.base.server.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext( "configuration.xml" );
        Server server = (Server) app.getBean( "server" );
        Person person = new Person( 1, "xiaoming", 30 );
        server.operationPersonSever( person );
    }
}
