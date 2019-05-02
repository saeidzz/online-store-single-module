package ir.rabbit.group.onlinestore.repository.security;
import ir.rabbit.group.onlinestore.model.security.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorityRepo extends PagingAndSortingRepository<Authority,Long>,CrudRepository<Authority,Long> {
}
