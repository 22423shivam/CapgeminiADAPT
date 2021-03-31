package com.assignment1.CustomerProd.Service;

import com.assignment1.CustomerProd.Model.Customer;
import com.assignment1.CustomerProd.RabbitMQConfig;
import com.assignment1.CustomerProd.Repo.CustomerRepo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerNotification {

    @Autowired
    CustomerRepo customerRepo;

    /**
     * use a new queue for consuming the customer produced
     * each time a customer is added to the DB
     */
    @RabbitListener(queues = RabbitMQConfig.queueName)
    public void consumeMess(Customer customer){
        customerRepo.save(customer);
        System.out.println("Customer added to DB");
    }
}
