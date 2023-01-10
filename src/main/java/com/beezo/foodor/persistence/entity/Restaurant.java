package com.beezo.foodor.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "com_restaurant")
@SequenceGenerator(name="com_restaurant_seq",sequenceName="COM_RESTAURANT_SEQ", allocationSize=1)
@Getter
@Setter
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "com_restaurant_seq")
    @Column(name="cre_id")
    private Long id;

    @Column(name="cre_name")
    private String name;





}
