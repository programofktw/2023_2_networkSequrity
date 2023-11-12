package kimleeduldul.kimleeduldul_spring.Service;

import kimleeduldul.kimleeduldul_spring.Entity.Login;
import kimleeduldul.kimleeduldul_spring.Repository.PhishingRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PhishingService {

    private final PhishingRepository phishingRepository;

    public void saveUserInfo(Login login){

        phishingRepository.saveUserInfo(login);
    }
}
