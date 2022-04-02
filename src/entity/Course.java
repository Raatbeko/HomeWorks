package entity;

import enums.Type_course;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "type_course",unique = true,nullable = false)
    @Enumerated(value = EnumType.STRING)
    Type_course type_course;


    @ManyToMany
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    List<Group> groups ;
}
