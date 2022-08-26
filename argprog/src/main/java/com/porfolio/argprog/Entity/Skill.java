
package com.porfolio.argprog.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @NotBlank
    @Size(min = 3, max = 40, message = "el nombre debe contener entre 4 y 20 caracteres")
    @Column
    private String nombre;
    
    
<<<<<<< HEAD
    @Min(1) @Max(100)
=======
    
>>>>>>> fa1730abd64b10663c3dd9ea8e612d3f898857be
    @NotNull
    @Min(0) @Max(100)
    @Column
    private int porcentaje;
     
    private String img;
    
    
    
    public Skill(){}

    public Skill(Long id, String nombre, int porcentaje, String img) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}

        




