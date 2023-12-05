package online.joanmarin.paginationexample.controller;

import online.joanmarin.paginationexample.model.User;
import online.joanmarin.paginationexample.service.PaginationExampleServiceImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaginationExampleController {
    private final PaginationExampleServiceImp paginationExampleServiceImp;
    private PaginationExampleController(PaginationExampleServiceImp
                                                paginationExampleServiceImp){
        this.paginationExampleServiceImp = paginationExampleServiceImp;
    }

    @GetMapping(path="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> findAllUsers(Pageable page){
        Page<User> pageUser = paginationExampleServiceImp.findAllUsers(
                PageRequest.of(
                        page.getPageNumber(),
                        page.getPageSize(),
                        page.getSortOr(Sort.by(Sort.Direction.DESC, "name"))
                )
        );
        return ResponseEntity.ok(pageUser.getContent());
    }

}
