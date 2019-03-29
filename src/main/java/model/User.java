package model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
