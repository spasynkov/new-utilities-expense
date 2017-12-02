package net.ukrtel.ddns.ff.utilities.entities;

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
    @ManyToOne
    @JoinColumn(name = "counter_id", foreignKey = @ForeignKey(name = "COUNTER_ID_FK"))
    private Counter counter;
    private int counterData;
    private Date counterReadingDate;
}
