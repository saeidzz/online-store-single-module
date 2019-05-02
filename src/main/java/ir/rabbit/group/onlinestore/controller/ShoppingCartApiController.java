package ir.rabbit.group.onlinestore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import ir.rabbit.group.onlinestore.dto.shopping.ShoppingCart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

@Controller
public class ShoppingCartApiController implements ShoppingCartApi {

    private static final Logger log = LoggerFactory.getLogger(ShoppingCartApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ShoppingCartApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addProductByProductId(@NotNull @ApiParam(value = "productId ", required = true) @Valid @RequestParam(value = "productId", required = true) Long productId, @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "shoppingCartID", required = true) Long shoppingCartID) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProductById(@NotNull @ApiParam(value = "productId ", required = true) @Valid @RequestParam(value = "productId", required = true) Long productId, @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "shoppingCartID", required = true) Long shoppingCartID) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ShoppingCart> findShoppingCartByCustomerId(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "customerId", required = true) Long customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ShoppingCart>(objectMapper.readValue("{  \"id\" : 0,  \"customer\" : \"{}\",  \"products\" : \"{}\"}", ShoppingCart.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ShoppingCart>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ShoppingCart>(HttpStatus.NOT_IMPLEMENTED);
    }

}
