package com.brayacheat.customer.Controller;

import com.brayacheat.customer.Model.CustomerEntity;
import com.brayacheat.customer.Service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public CustomerEntity create_customer(@RequestBody CustomerEntity customer){
        return customerService.create_customer(customer);
    }

    @GetMapping("/{id}")
    public CustomerEntity get_customer(@PathVariable long id){
        return customerService.get_customer(id);
    }

    @GetMapping
    public List<CustomerEntity> list_customer(){
        return customerService.list_customer();
    }

    @PutMapping("/{id}")
    public CustomerEntity update_customer(@PathVariable long id, @RequestBody CustomerEntity customer){
        return customerService.update_customer(id, customer);
    }
}
