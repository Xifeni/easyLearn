package core.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private boolean enabled;
}
