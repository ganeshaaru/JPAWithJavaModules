package com.r.service.jpa.concepts;

public class ValueTypes {

  public static void main(String[] args) {

      PersonEntity personAsEntity = new PersonEntity();

      Address homeAddressAsValueType =  new Address();
      Address billingAddressAsValueType =  new Address();

      personAsEntity.id=2L; //database identity
      personAsEntity.billingAddress = billingAddressAsValueType;
      personAsEntity.homeAddress = homeAddressAsValueType;

  }

/*
*       Person as entity is mapped to table and has an database identity
* */
    static class PersonEntity{
            Long id;
            Address homeAddress;
            Address billingAddress;
    }
/*
*   maps to same person table columns and does have identity on it own.
* */
    static class Address{
        String street;
        String pincode;
    }


}
