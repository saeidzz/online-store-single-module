/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ir.rabbit.group.onlinestore.controller;

import io.swagger.annotations.*;
import ir.rabbit.group.onlinestore.dto.customer.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

@Api(value = "customer", description = "the customer API")
public interface CustomerApi {

    @ApiOperation(value = "Add a new customer to the store", nickname = "addCustomer", notes = "", tags = {"customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input")})
    @RequestMapping(value = "/customer",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> addCustomer(@ApiParam(value = "customer object that needs to be added to the store", required = true) @Valid @RequestBody Customer body);


    @ApiOperation(value = "Deletes a customer", nickname = "deleteCustomer", notes = "", tags = {"customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Product not found")})
    @RequestMapping(value = "/customer/{customerId}",
            produces = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomer(@ApiParam(value = "customer id to delete", required = true) @PathVariable("customerId") Long customerId);


    @ApiOperation(value = "Find customer by ID", nickname = "getCustomerById", notes = "Returns a single customer", response = Customer.class, tags = {"customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Customer.class),
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "customer not found")})
    @RequestMapping(value = "/customer/{customerId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Customer> getCustomerById(@ApiParam(value = "ID of customer to return", required = true) @PathVariable("customerId") Long customerId);


    @ApiOperation(value = "Update an existing customer", nickname = "updateCustomer", notes = "", tags = {"customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "customer not found"),
            @ApiResponse(code = 405, message = "Validation exception")})
    @RequestMapping(value = "/customer",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateCustomer(@ApiParam(value = "customer object that needs to be updated in the store", required = true) @Valid @RequestBody Customer body);

}