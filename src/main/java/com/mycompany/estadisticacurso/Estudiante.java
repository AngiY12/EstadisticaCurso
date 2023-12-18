/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticacurso;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    private double nota; 
    private int semestre; 
    
    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    public double getNota() {
        return nota;
    }

    public int getSemestre() {
        return semestre;
    }
}