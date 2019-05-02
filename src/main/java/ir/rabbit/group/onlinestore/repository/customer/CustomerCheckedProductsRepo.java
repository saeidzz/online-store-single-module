package ir.rabbit.group.onlinestore.repository.customer;
import ir.rabbit.group.onlinestore.model.customer.CustomerCheckedProducts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerCheckedProductsRepo extends PagingAndSortingRepository<CustomerCheckedProducts,Long>,CrudRepository<CustomerCheckedProducts,Long> {
}
