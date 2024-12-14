package org.sid.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = Customer.class)
public interface CustomerProjection {
    String getName();
    String getEmail();

}
