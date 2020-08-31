module com.r.service {
    requires spring.beans;
    requires spring.context;
    requires org.slf4j;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires com.r.persistence;
    requires spring.tx;


    opens com.r.service to spring.core;
    opens com.r.service.jpa.mappings to spring.core,  spring.aop;

    exports com.r.service to spring.beans,  spring.context;
    exports com.r.service.jpa.mappings to spring.beans,  spring.context;
}
