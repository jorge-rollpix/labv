package edu.utn.utnphones.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Table(name="calls")
@Entity

public class Call {

    @Id
    @Column(name = "entity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entityId;

    @Column(name= "number_sender")
    private Integer numberSender;

    @Column(name= "number_receiver")
    private Integer numberReceiver;

    @ManyToOne//(optional = false)
    @JoinColumn(name = "localitie_sender_id")
    private Locality localitySender;

    @ManyToOne//(optional = false)
    @JoinColumn(name = "localitie_receiver_id")
    private Locality localityReceiver;

    @Column(name= "price_per_minute")
    private Double pricePerMinute;

    @Column(name= "duration")
    private Integer duration;

    @Column(name= "total_price")
    private Double totalPrice;

    @ManyToOne//(optional = false)
    @JoinColumn(name = "bill_id")
    private Bill bill;



}

