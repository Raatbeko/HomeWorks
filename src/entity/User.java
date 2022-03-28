package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "e_mail")
    private String eMail;

    private String password;

    @Column(name = "data_of_registration")
    private LocalDateTime dateOfRegistration;

    private String role;

    public User(String userName, String eMail, String password, LocalDateTime dateOfRegistration, String role) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.role = role;
    }
}
