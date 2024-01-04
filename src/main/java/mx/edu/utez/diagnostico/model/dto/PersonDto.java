package mx.edu.utez.diagnostico.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDto {
    private Integer id_person;
    private String firstname;
    private String lastname;
    private String curp;
    private String birthdate;
}