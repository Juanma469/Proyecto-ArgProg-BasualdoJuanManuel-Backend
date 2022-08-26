
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   
    @NotBlank
    @Size(min = 4, max=40, message = "el nombre debe contener entre 4 y 40 caracteres")
    @Column
    private String titulo;
    
    
    @NotBlank
    @Size(min = 4, max=40, message = "el nombre debe contener entre 4 y 40 caracteres")
    @Column
    private String puesto;
    
    
    @NotBlank
    @Size(min = 10, max = 200, message = "el nombre debe contener entre 10 y 200 caracteres")
    @Column(length = 300)
    private String descripcion;
    
    
    @Min(1965) @Max(2022)
    @NotNull
    @Column
    private int fecha;
    
    private String img;
    
    public Experiencia(){}

    public Experiencia(Long id, String titulo, String puesto, String descripcion ,int fecha, String img) {
        this.id = id;
        this.titulo = titulo;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.img = img;
    }
    
     public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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
