package ir.rabbit.group.onlinestore.repository.product;
import ir.rabbit.group.onlinestore.model.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepo extends PagingAndSortingRepository<Product,Long>,CrudRepository<Product,Long> {
}
