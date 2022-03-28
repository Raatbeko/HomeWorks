package model;

import enums.Roles;

public class Role {
    Integer id;
    Roles role;

    public Role(Integer id, Roles role) {
        this.id = id;
        this.role = role;
    }
}
