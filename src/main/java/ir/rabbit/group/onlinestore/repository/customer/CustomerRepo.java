package ir.rabbit.group.onlinestore.repository.customer;
import ir.rabbit.group.onlinestore.model.customer.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepo extends PagingAndSortingRepository<Customer,Long>,CrudRepository<Customer,Long> {
}
