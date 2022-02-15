package LEILAYASSINEMSI2.cigma.Services;

import LEILAYASSINEMSI2.cigma.dao.UserRepository;
import LEILAYASSINEMSI2.cigma.Entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepository;
    @Override
    public Page<user> selectAll(Pageable pageable){
        return UserRepository.findAll(pageable);
    }

    @Override
    public user insert(utilisateur){
        return UserRepository.save(utilisateur);
    }

}

