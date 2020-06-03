package edu.utn.utnphones.models;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Table(name="rates")
@Entity

public class Rate {

    @Id
    @Column(name = "entity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entityId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "localitie_sender_id")
    private Locality localitieSenderId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "localitie_receiver_id")
    private Locality localitieReceiverId;

    @Column(name = "price")
    private Double price;

    @Column(name = "cost")
    private Double cost;

}
