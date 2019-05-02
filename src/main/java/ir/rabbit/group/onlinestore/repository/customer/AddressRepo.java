package ir.rabbit.group.onlinestore.repository.customer;

import ir.rabbit.group.onlinestore.model.customer.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AddressRepo extends PagingAndSortingRepository<Address,Long>,CrudRepository<Address,Long> {
    public Address save(Address address);
}
