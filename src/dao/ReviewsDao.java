package dao;

import entity.Reviews;
import entity.User;

import java.util.List;

public interface ReviewsDao {
    String insert(Reviews reviews);

    String update(Reviews reviews);

    List<Reviews> getAll();

    String delete(Reviews reviews);
}
