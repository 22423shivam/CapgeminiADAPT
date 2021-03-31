package com.assignment1.CustomerProd.Service;

import com.assignment1.CustomerProd.Model.Customer;
import com.assignment1.CustomerProd.RabbitMQConfig;
import com.assignment1.CustomerProd.Repo.CustomerRepo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customer-service")
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    AmqpTemplate amqpTemplate;

    /*@Autowired
    RabbitMQConfig rabbitMQConfig = new RabbitMQConfig();*/

    @PostMapping("add-customer")
    public String addCustomer(@RequestBody Customer customer){
        amqpTemplate.convertAndSend(RabbitMQConfig.topicExchange,RabbitMQConfig.routingKey,customer);
        return "Customer added";
    }

    @GetMapping("/get-customers")
    public List<Customer> getCustomers(){
        return customerRepo.findAll();
    }
}
