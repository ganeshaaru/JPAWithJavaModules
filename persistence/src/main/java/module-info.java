module com.r.persistence {
    requires spring.boot.starter.data.jpa;
    requires spring.boot.starter;
    requires spring.boot.autoconfigure;
    requires  spring.context;
    requires java.persistence;
    requires java.sql;
    requires spring.orm;
    requires spring.jdbc;
    requires net.bytebuddy;
    requires com.fasterxml.classmate;
    requires java.xml.bind;
    requires spring.tx;
    opens com.r.persistence.config to spring.core;
    opens com.r.persistence.dao to spring.core, spring.aop;
    opens com.r.persistence.entity to spring.core, org.hibernate.orm.core;

    exports com.r.persistence.dao to com.r.service, spring.beans ;
    exports com.r.persistence.config to com.r.service, spring.beans, spring.context ;
    exports com.r.persistence.entity to com.r.service;


}