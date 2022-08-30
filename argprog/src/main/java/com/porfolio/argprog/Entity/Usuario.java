package com.porfolio.argprog.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Usuario implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
        @Column (nullable = false, updatable = false)
	private Long id;
        
        
        @NotBlank
        @Size(min = 4, max= 40, message = "el nombre debe contener entre 4 y 45 caracteres")
        @Column
	private String nombre;
        
        
        @NotBlank
        @Size(min = 4, max= 40, message = "el apellido debe contener entre 4 y 30 caracteres")
        @Column
	private String apellido;
        
       
        @NotBlank
        @Size(min = 4, max= 50, message = "el titulo debe contener entre 4 y 40 caracteres")
        @Column
        private String titulo;
        
        
        @NotBlank
        @Size(min = 10, max = 300, message = "la descripcion debe contener entre 10 y 200 caracteres")
        @Column
        private String descripcion;
        
        @Column
        private String img;

        @Column
        private String linkedin;
        
        @Column
        @Email
        private String email;

  



    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String titulo, String descripcion, String img, String linkein, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
        this.linkedin = linkein;
        this.email = email;
       
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
     public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    
      public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
        
        
        
        
        
}  