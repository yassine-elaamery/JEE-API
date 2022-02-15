package LEILAYASSINEMSI2.cigma.controllers;
import LEILAYASSINEMSI2.cigma.Entities.user;
import LEILAYASSINEMSI2.cigma.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Users/test")
public class UserRestController {
    @Autowired
    Private UserService service;

    @GetMapping("/ListeUser")
    public Page<user> getpagination(Pageable pageable) {
        return service.selectAll(pageable);
    }
    @PostMapping("/UserCreat")
    {
        public user insert(@RequestBody user){
            return service.insert(user);
    }

}