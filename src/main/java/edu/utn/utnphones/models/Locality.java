package edu.utn.utnphones.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Table(name="localities")
@Entity

public class Locality implements Serializable {

    @Id
    @Column(name = "entity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entityId;

    @Column(name = "name")
    private String name;

    @Column(name = "prefix")
    private Integer prefix;

    /*

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "province_id")
    @JsonBackReference
    private Province province;*/

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "province_id")
    private Province province;

}
