package ir.rabbit.group.onlinestore.repository.customer;

import ir.rabbit.group.onlinestore.model.customer.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StateRepo extends PagingAndSortingRepository<State,Long>,CrudRepository<State,Long> {
}
