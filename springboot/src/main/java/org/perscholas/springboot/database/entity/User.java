package org.perscholas.springboot.database.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private List<Customer> customer;
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Customer> customers;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;
}
