package entity;

import enums.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "news_category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "news_category",nullable = false,unique = true)
    Category newsCategory;

    @Override
    public String toString() {
        return "NewsCategory{" +
                "id=" + id +
                ", newsCategory=" + newsCategory +
                '}';
    }
}
