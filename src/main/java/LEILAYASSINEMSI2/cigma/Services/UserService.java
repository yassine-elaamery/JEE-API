package LEILAYASSINEMSI2.cigma.Services;
import LEILAYASSINEMSI2.cigma.Entities.user;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

        Page<user> selectAll(Pageable page);
        user insert(user);
}

