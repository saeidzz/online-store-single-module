package ir.rabbit.group.onlinestore.repository.product;
import ir.rabbit.group.onlinestore.model.product.WishListHasProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WishListHasProductRepo extends PagingAndSortingRepository<WishListHasProduct,Long>,CrudRepository<WishListHasProduct,Long> {
}
