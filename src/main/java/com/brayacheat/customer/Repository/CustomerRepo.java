package com.brayacheat.customer.Repository;

import com.brayacheat.customer.Model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {
}
