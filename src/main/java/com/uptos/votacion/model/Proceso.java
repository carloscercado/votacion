package com.uptos.votacion.model;  
// Generated 14-feb-2017 20:31:44 by Hibernate Tools 4.3.1



/**
 * Proceso generated by hbm2java
 */
public class Proceso  implements java.io.Serializable {


     private int id;
     private Cargo cargo;
     private Estudiante estudiante;
     private Plancha plancha;

    public Proceso() {
    }

    public Proceso(int id, Cargo cargo, Estudiante estudiante, Plancha plancha) {
       this.id = id;
       this.cargo = cargo;
       this.estudiante = estudiante;
       this.plancha = plancha;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Plancha getPlancha() {
        return this.plancha;
    }
    
    public void setPlancha(Plancha plancha) {
        this.plancha = plancha;
    }




}


