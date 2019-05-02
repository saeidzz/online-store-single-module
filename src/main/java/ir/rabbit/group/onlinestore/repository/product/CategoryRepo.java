package ir.rabbit.group.onlinestore.repository.product;
import ir.rabbit.group.onlinestore.model.product.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepo extends PagingAndSortingRepository<Category,Long>,CrudRepository<Category,Long> {
}
