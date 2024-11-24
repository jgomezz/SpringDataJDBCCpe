package pe.edu.tecsup.springbootapp.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria {

    private Long id;
    private String nombre;
    private Integer orden;
}
