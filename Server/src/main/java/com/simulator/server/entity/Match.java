package com.simulator.server.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Team home;

    @ManyToOne
    private Team away;

    @Column
    Date date;
}
