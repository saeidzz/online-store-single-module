package ir.rabbit.group.onlinestore.repository.shopping;
import ir.rabbit.group.onlinestore.model.shopping.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PaymentRepo extends PagingAndSortingRepository<Payment,Long>,CrudRepository<Payment,Long> {
}
