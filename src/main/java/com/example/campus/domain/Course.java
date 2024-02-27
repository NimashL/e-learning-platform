package com.example.campus.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "instructor_id", nullable = false)
    public User user;

    @Column(name = "duration")
    private String duration;

    @Column(name = "course_fee")
    private BigDecimal courseFee;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "modified_user")
    private String modifiedUser;


}
