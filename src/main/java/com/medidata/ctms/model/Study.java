package com.medidata.ctms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT-04:00")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+05:30")
    @Column(name = "start_date")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+05:30" )
    @Column(name = "end_date")
    private Date endDate;

//    private String organization;
}
