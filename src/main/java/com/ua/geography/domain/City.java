package com.ua.geography.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String city_name;
    @Column
    private Long country_id;
    @Column
    private Long population;
    @Column
    private Long area;
    @Column
    private Integer rounded_year;
    @Column
    private String region;

}
