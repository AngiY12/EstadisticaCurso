/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticacurso;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Curso {
    private int cantidadEstudiantes;
    private ArrayList<Estudiante> estudiantes;
    private String nomCurso;
    
    // constructor con parámetros
    public Curso( String nomCurso){
        this.estudiantes = new ArrayList<>();
        this.nomCurso = nomCurso;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
    
    public double cursoProm() {

        double notaProm = 0;
        for (Estudiante estudiante : estudiantes) {
            notaProm += estudiante.getNota();
        }
        double promcurs=notaProm / estudiantes.size();

        return promcurs;
        }
    
      public int modaSemestre() {
        Map<Integer, Integer> frecuenciaSemestres = new HashMap<>();
        for (Estudiante estudiante : estudiantes) {
            int semestre = estudiante.getSemestre();
            frecuenciaSemestres.put(semestre, frecuenciaSemestres.getOrDefault(semestre, 0) + 1);
        }

        int moda = -1;
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuenciaSemestres.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        return moda;
      }
      
    public int estudiantesPerdieron() 
    {
        int contadorPerdieron = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() < 14) {
                contadorPerdieron++;
            }
        }
        return contadorPerdieron;
    }
    
    public int estudiantesGanaron()
    {
        int contadorGanaron = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > 14) {
                contadorGanaron++;
            }
        }
        return contadorGanaron;
    }    
}

