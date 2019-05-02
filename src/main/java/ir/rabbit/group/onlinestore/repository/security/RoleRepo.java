package ir.rabbit.group.onlinestore.repository.security;
import ir.rabbit.group.onlinestore.model.security.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepo extends PagingAndSortingRepository<Role,Long>,CrudRepository<Role,Long> {
}
