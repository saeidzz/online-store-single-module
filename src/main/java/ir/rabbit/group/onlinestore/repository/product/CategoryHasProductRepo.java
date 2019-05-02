package ir.rabbit.group.onlinestore.repository.product;
import ir.rabbit.group.onlinestore.model.product.CategoryHasProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryHasProductRepo extends PagingAndSortingRepository<CategoryHasProduct,Long>,CrudRepository<CategoryHasProduct,Long> {
}
