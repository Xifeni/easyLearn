package core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private UUID userId;
    @Column
    private Roles role;

    private enum Roles{
        ADMIN(0), USER(1), OTHER(2);

        private final int flag;

        Roles(int flag) {
            this.flag = flag;
        }
    }
}
