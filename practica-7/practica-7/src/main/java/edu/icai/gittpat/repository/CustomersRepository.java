package edu.icai.gittpat.repository;

import org.springframework.data.repository.CrudRepository;

import edu.icai.gittpat.model.CustomerTable;

import org.springframework.data.jdbc.repository.query.Query;


public interface CustomersRepository extends CrudRepository<CustomerTable, Long> { 

    @Query("SELECT * FROM CUSTOMERS WHERE CUSTOMERS.ID = :id")
    public Iterable <CustomerTable> retrieveCustomerById(Long id);

    @Query("SELECT * FROM CUSTOMERS WHERE CUSTOMERS.CUSTOMER_NAME = :customerName")
    public Iterable <CustomerTable> retrieveCustomerByCustomerName(String customerName);

    @Query("SELECT * FROM CUSTOMERS WHERE CUSTOMERS.CONTACT_NAME = :contactName")
    public Iterable <CustomerTable> retrieveCustomerByContactName(String conctactName);

    @Query("SELECT * FROM CUSTOMERS WHERE CUSTOMERS.COUNTRY = :country")
    public Iterable <CustomerTable> retrieveCustomerByCountry(String country);
}
