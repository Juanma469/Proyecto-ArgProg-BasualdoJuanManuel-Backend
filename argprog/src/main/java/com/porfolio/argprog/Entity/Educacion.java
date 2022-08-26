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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   
    @NotBlank
    @Size(min = 4, max = 40, message = "el titulo debe contener entre 4 y 20 caracteres")
    @Column
    private String titulo;
    
    
    @NotBlank
    @Size(min = 10, max = 200, message = "la descripcion debe contener entre 10 y 200 caracteres)")
    @Column(length = 300)
    private String descripcion;
    
   
    @Min(1965) @Max(2022)
    @NotNull
    @Column
    private int fecha;
    
    @Column
    private String img;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String descripcion, int fecha, String img) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
