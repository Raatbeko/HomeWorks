package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "news_headline")
    String newsHeadline;

    @Column(name = "news_text")
    String news_text;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    NewsCategory newsCategory;
}

