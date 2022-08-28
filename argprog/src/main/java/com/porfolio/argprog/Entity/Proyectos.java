
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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @NotBlank
    @Size(min = 4, max = 40, message = "el nombre debe contener entre 4 y 20 caracteres)")
    @Column
    private String nombre;
    
    
    @NotBlank
    @Size(min = 3, max = 200, message = "la tecnologias debe contener entre 3 y 100 caracteres)")
    @Column
    private String tecno;
    
    
    @NotBlank
    @Size(min = 10, max= 200, message = "la descripcion debe contener entre 10 y 20 caracteres)")
    @Column(length = 300)
    private String descripcion;
    
    
    
     @Column
     private String link;
    
    @NotNull
    @Min(1965) @Max(2022)
    @Column
    private int fecha;
    
    private String img;
    
    
    
    public Proyectos(){}

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

    public String getTecno() {
        return tecno;
    }

    public void setTecno(String tecno) {
        this.tecno = tecno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
    
    
}
