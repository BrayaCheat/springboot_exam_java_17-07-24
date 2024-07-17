package com.brayacheat.customer.Service;

import com.brayacheat.customer.Model.CustomerEntity;
import com.brayacheat.customer.Repository.CustomerRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public CustomerEntity create_customer(CustomerEntity customer){
        return customerRepo.save(customer);
    }

    public CustomerEntity get_customer(long id){
        return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public List<CustomerEntity> list_customer(){
        return customerRepo.findAll();
    }

    public CustomerEntity update_customer(long id, CustomerEntity customer){
        CustomerEntity existingCustomer = customerRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());

        return customerRepo.save(existingCustomer);
    }

}
