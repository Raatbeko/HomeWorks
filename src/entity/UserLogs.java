package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_logs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //OneToOne
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private LocalDateTime loginTime;

    private LocalDateTime updateTime;

    private String LoginResult;
}
