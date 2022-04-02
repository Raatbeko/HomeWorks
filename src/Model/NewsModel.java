package Model;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewsModel {

    String newsHeadline;

    String newsText;

    @Override
    public String toString() {
        return "NewsModel{" +
                "newsHeadline='" + newsHeadline + '\'' +
                ", newsText='" + newsText + '\'' +
                '}';
    }

}
