package edu.utn.utnphones.models;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Table(name="phone_lines")
@Entity

public class PhoneLine {

    @Id
    @Column(name = "entity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entityId;

    @Column(name = "number")
    private Integer number;

    @Column(name = "type")
    private String type;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;
}


/*
create table if not exists phone_lines
(

    entity_id int auto_increment not null,
    number    int                not null,
    type      enum ('hogar','movil'),
    user_id   int                not null,
    constraint pk_phone_lines_entity_id primary key (entity_id),
    constraint fk_users_id foreign key (user_id) references users (entity_id)

);
*/