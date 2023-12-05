package online.joanmarin.paginationexample.repository;

import online.joanmarin.paginationexample.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaginationExampleRepository extends PagingAndSortingRepository<User, Integer> {
}
