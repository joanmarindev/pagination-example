package online.joanmarin.paginationexample.service;

import online.joanmarin.paginationexample.model.User;
import online.joanmarin.paginationexample.repository.PaginationExampleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PaginationExampleServiceImp {
    private final PaginationExampleRepository paginationExampleRepository;
    private PaginationExampleServiceImp(PaginationExampleRepository
                                                paginationExampleRepository){
        this.paginationExampleRepository = paginationExampleRepository;
    }

    public Page<User> findAllUsers(Pageable page){
        return this.paginationExampleRepository.findAll(page);
    }
}
