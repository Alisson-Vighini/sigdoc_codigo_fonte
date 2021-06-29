package com.basis.colatina.sigdoc.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskListDTO {

    private Long id;

    private String title;

    private LocalDate initialDate;

    private LocalDate finalDate;

    private String status;

    private ResponsibleTaskDTO responsible;

}
