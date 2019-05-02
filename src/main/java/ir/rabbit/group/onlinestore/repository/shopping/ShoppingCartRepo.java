package ir.rabbit.group.onlinestore.repository.shopping;
import ir.rabbit.group.onlinestore.model.shopping.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShoppingCartRepo extends PagingAndSortingRepository<ShoppingCart,Long>,CrudRepository<ShoppingCart,Long> {
}
