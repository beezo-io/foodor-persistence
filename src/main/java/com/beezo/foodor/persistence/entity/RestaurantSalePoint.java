package com.beezo.foodor.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="com_restaurant_branch")
@SequenceGenerator(name="com_restaurant_sale_point_seq",sequenceName="COM_RESTAURANT_SALE_POINT_SEQ", allocationSize=1)
@Getter
@Setter
public class RestaurantSalePoint implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "com_restaurant_sale_point_seq")
    @Column(name="crp_id")
    private Long id;

    @Column(name="crp_name",nullable = false)
    private String name;

}
