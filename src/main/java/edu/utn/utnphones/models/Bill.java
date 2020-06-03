package edu.utn.utnphones.models;


import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Table(name="bills")
@Entity

public class Bill {

    @Id
    @Column(name = "entity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entityId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "phone_line_id")
    private PhoneLine phoneLineId;

    @Column(name = "total_calls")
    private Integer totalCalls;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "total_cost")
    private Double totalCost;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "expired_at")
    private Timestamp expiredAt;

}

/*create table if not exists bills(
    entity_id int auto_increment not null,
    phone_line_id int not null,
    total_calls int not null,
    total_price decimal(6,2) not null,
    total_cost decimal(6,2) not null,
    created_at timestamp,
    expired_at timestamp,
    constraint pk_bills_entity_id primary key (entity_id),
    constraint fk_phone_lines_id foreign key (phone_line_id) references phone_lines (entity_id)
);*/