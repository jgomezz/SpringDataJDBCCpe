package pe.edu.tecsup.springbootapp.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Categoria {

    private Long id;
    private String nombre;
    private Integer orden;
}
