package kimleeduldul.kimleeduldul_spring.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class LoginRequest {
    private String userName;
    private String passWord;
}
