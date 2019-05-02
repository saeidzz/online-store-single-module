package ir.rabbit.group.onlinestore.repository.shopping;
import ir.rabbit.group.onlinestore.model.shopping.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepo extends PagingAndSortingRepository<Order,Long>,CrudRepository<Order,Long> {
}
