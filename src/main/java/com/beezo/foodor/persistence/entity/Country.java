package com.beezo.foodor.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="com_country")
@SequenceGenerator(name="com_country_seq",sequenceName="COM_COUNTRY_SEQ", allocationSize=1)
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "com_country_seq")
    @Column(name="cco_id")
    private Integer id;
}
