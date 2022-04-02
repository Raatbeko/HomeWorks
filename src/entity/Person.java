package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "full_name", nullable = false)
    String name;

    @Column(name = "age", nullable = false)
    Integer age;

    @Column(name = "passport_id",nullable = false,unique = true)
    Long passportId;

}
