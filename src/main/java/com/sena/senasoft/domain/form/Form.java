package com.sena.senasoft.domain.form;

import com.sena.senasoft.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tb_forms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;


    private LocalDate start;

    private LocalDate end;

    @ManyToOne
    @JoinColumn(name = "creador_id", referencedColumnName = "id")
    private User creador;

}
