package entity;

import enums.Event_type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.build.AccessControllerPlugin;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_type_id", referencedColumnName = "id")
    private Event event;

    private String img;

    private String comment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    @Column(name = "count_place")
    private Integer countPlace;

    private Integer price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

    @Column(columnDefinition = "TIMESTAMP", name = "data_of_post")
    private LocalDateTime dateOfPost;

    @Column(columnDefinition = "TIMESTAMP",name = "data_of_begin")
    private LocalDateTime dataOfBegin;
}
