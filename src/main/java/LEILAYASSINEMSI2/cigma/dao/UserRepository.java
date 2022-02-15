package LEILAYASSINEMSI2.cigma.dao;

        import LEILAYASSINEMSI2.cigma.Entities.user;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<user,Long> {

}
