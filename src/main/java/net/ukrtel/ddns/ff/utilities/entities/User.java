package net.ukrtel.ddns.ff.utilities.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private UserRole role;
    @JsonIgnore
    private String password;
    private String surname;
    private String name;
    private String fatherName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Counter> counters;
}
