package dao;

import entity.Event;
import entity.User;

import java.util.List;

public interface EventDao {
    String insert(Event event);

    String update(Event event);

    List<Event> getAll();

    String delete(Event event);
}
