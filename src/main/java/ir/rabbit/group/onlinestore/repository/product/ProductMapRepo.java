package ir.rabbit.group.onlinestore.repository.product;
import ir.rabbit.group.onlinestore.model.product.ProductMap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductMapRepo extends PagingAndSortingRepository<ProductMap,Long>,CrudRepository<ProductMap,Long> {
}
