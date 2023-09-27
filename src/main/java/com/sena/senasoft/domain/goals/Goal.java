package com.sena.senasoft.domain.goals;

import com.sena.senasoft.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tb_goals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date start;
    private Date finish;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
