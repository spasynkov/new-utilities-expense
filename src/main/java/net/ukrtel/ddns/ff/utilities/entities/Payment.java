package net.ukrtel.ddns.ff.utilities.entities;

import java.util.Date;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "counter_id", foreignKey = @ForeignKey(name = "COUNTER_ID_FK"))
    private Counter counter;
    private double paymentSum;
    private double accountBalance;
    private Date paymentDate;
}