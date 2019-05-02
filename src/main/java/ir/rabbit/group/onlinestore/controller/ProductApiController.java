package ir.rabbit.group.onlinestore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import ir.rabbit.group.onlinestore.dto.product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

@Controller
public class ProductApiController implements ProductApi {

    private static final Logger log = LoggerFactory.getLogger(ProductApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addProduct(@ApiParam(value = "product object that needs to be added to the store", required = true) @Valid @RequestBody Product body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProduct(@ApiParam(value = "Product id to delete", required = true) @PathVariable("productId") Long productId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Product>> findProductByTitle(@NotNull @ApiParam(value = "input title should be longer than 3 chars", required = true) @Valid @RequestParam(value = "status", required = true) String status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Product>>(objectMapper.readValue("[ {  \"features\" : \"{}\",  \"images\" : \"{}\",  \"comments\" : \"{}\",  \"Categories\" : \"{}\",  \"name\" : \"name\",  \"id\" : 0,  \"manufacturer\" : \"manufacturer\"}, {  \"features\" : \"{}\",  \"images\" : \"{}\",  \"comments\" : \"{}\",  \"Categories\" : \"{}\",  \"name\" : \"name\",  \"id\" : 0,  \"manufacturer\" : \"manufacturer\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Product>> findProductsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Product>>(objectMapper.readValue("[ {  \"features\" : \"{}\",  \"images\" : \"{}\",  \"comments\" : \"{}\",  \"Categories\" : \"{}\",  \"name\" : \"name\",  \"id\" : 0,  \"manufacturer\" : \"manufacturer\"}, {  \"features\" : \"{}\",  \"images\" : \"{}\",  \"comments\" : \"{}\",  \"Categories\" : \"{}\",  \"name\" : \"name\",  \"id\" : 0,  \"manufacturer\" : \"manufacturer\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Product> getProductById(@ApiParam(value = "ID of product to return", required = true) @PathVariable("productId") Long productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Product>(objectMapper.readValue("{  \"features\" : \"{}\",  \"images\" : \"{}\",  \"comments\" : \"{}\",  \"Categories\" : \"{}\",  \"name\" : \"name\",  \"id\" : 0,  \"manufacturer\" : \"manufacturer\"}", Product.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateProduct(@ApiParam(value = "product object that needs to be updated in the store", required = true) @Valid @RequestBody Product body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> uploadFile(@ApiParam(value = "ID of product to update", required = true) @PathVariable("productId") Long productId, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
