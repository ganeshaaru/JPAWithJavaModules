module com.r.service {
    requires spring.beans;
    requires spring.context;
    requires org.slf4j;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires com.r.persistence;


    opens com.r.service to spring.core;

    exports com.r.service to spring.beans,  spring.context;
}
