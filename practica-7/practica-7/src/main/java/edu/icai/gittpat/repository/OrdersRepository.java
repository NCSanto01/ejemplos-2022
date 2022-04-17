package edu.icai.gittpat.repository;

import java.time.LocalDate;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import edu.icai.gittpat.model.OrderTable;

public interface OrdersRepository extends CrudRepository<OrderTable, Long> { 

    @Query("SELECT * FROM ORDERS WHERE ORDERS.ID = :id")
    public Iterable <OrderTable> retrieveOrderById(Long id);

    @Query("SELECT * FROM ORDERS WHERE ORDERS.CUSTOMER_ID = :customerId")
    public Iterable <OrderTable> retrieveOrderByCostumerId(Long costumerId);

    @Query("SELECT * FROM ORDERS WHERE ORDERS.ORDER_DATE = :date")
    public Iterable <OrderTable> retrieveOrderByDate(LocalDate date);
}
