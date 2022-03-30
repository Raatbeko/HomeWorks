package entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;

    @Column(name = "e_mail",nullable = false,unique = true)
    private String eMail;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "data_of_registration",nullable = false)
    private LocalDateTime dateOfRegistration;
}