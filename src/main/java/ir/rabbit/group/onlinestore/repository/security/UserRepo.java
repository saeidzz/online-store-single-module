package ir.rabbit.group.onlinestore.repository.security;
import ir.rabbit.group.onlinestore.model.security.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<User,Long>,CrudRepository<User,Long> {
}
