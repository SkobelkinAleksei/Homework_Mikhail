package gigabank.accountmanagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Информация о пользователе
 */
@Getter
@Setter

class User {
    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
