package ir.rabbit.group.onlinestore.repository.shopping;
import ir.rabbit.group.onlinestore.model.shopping.WishList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WishListRepo extends PagingAndSortingRepository<WishList,Long>,CrudRepository<WishList,Long> {
}
