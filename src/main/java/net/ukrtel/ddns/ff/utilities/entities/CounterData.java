package net.ukrtel.ddns.ff.utilities.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "counter_data")
public class CounterData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "counter_id")
    private Counter counter;
    private int counterData;
    private Date counterReadingDate;
}
