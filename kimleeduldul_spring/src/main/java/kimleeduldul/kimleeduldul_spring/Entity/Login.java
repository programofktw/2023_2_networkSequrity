package kimleeduldul.kimleeduldul_spring.Entity;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "Login")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Login {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "UserPassword")
    private String Password;


    @Builder
    public Login(String userName, String password){
        this.userName = userName;
        this.Password = password;
    }
}
