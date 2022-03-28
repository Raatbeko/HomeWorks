package dao;


import entity.EventType;
import entity.User;

import java.util.List;

public interface EventTypeDao {
    String insert(EventType event);

    String update(EventType event);

    List<EventType> getAll();

    String delete(EventType event);
}
