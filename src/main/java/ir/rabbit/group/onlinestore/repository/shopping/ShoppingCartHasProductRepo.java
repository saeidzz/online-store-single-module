package ir.rabbit.group.onlinestore.repository.shopping;
import ir.rabbit.group.onlinestore.model.shopping.ShoppingCartHasProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShoppingCartHasProductRepo extends PagingAndSortingRepository<ShoppingCartHasProduct,Long>,CrudRepository<ShoppingCartHasProduct,Long> {
}
