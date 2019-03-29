package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column
    private String id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private boolean enabled;
}
