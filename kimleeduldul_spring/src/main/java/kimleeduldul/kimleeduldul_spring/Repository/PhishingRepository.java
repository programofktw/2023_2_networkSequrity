package kimleeduldul.kimleeduldul_spring.Repository;

import kimleeduldul.kimleeduldul_spring.Entity.Login;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class PhishingRepository {

    @PersistenceContext
    EntityManager em;

    public void saveUserInfo(Login login){
        em.persist(login);
    }
}
