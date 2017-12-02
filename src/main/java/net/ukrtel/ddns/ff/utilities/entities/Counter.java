package net.ukrtel.ddns.ff.utilities.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "counters")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private UtilityType type;
    private String name;
    private String location;
}
