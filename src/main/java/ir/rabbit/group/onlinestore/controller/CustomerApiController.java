package ir.rabbit.group.onlinestore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import ir.rabbit.group.onlinestore.dto.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

@Controller
public class CustomerApiController implements CustomerApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addCustomer(@ApiParam(value = "customer object that needs to be added to the store" ,required=true )  @Valid @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomer(@ApiParam(value = "customer id to delete",required=true) @PathVariable("customerId") Long customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerById(@ApiParam(value = "ID of customer to return",required=true) @PathVariable("customerId") Long customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"lastName\" : \"lastName\",  \"address\" : \"{}\",  \"userName\" : \"userName\",  \"birthDate\" : \"birthDate\",  \"wishList\" : \"{}\",  \"mobileNumer\" : \"mobileNumer\",  \"phone\" : \"phone\",  \"name\" : \"name\",  \"shoppingCart\" : \"{}\",  \"orders\" : \"{}\",  \"id\" : 0,  \"shoppingAddress\" : \"{}\",  \"email\" : \"email\"}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCustomer(@ApiParam(value = "customer object that needs to be updated in the store" ,required=true )  @Valid @RequestBody Customer body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
