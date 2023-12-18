/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticacurso;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class EstadisticaCurso {

    public static void main(String[] args) {
        
        int semestre;
        double nota;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuál es el nombre del curso al cual se hará la estadística? ");
        String nomCurso = scanner.next();

        Curso estadistica = new Curso(nomCurso);

        System.out.print("Cuántos estudiantes se registrarán? ");
        int cantidadEstudiantes = scanner.nextInt();
        
        ArrayList<Estudiante>listaDeEstudiantes= new ArrayList<>();
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            // Ingreso de la info
            System.out.println("Estudiante N° " + (i + 1) + " :");
            System.out.print("En qué semestre está el estudiante? : ");
            semestre = scanner.nextInt();
            System.out.print("Cuál es su nota final?: ");
            nota = scanner.nextDouble();

            // Crear instancia de Estudiante y agregar al curso
            Estudiante estudiante = new Estudiante();
            
            estudiante.setSemestre(semestre);
            estudiante.setNota(nota);
            
            listaDeEstudiantes.add(estudiante);
            estadistica.agregarEstudiante(estudiante);
            
        }

        // Imprimir el promedio y la moda
        System.out.println("\n \t ESTADISTICA DEL CURSO");
        System.out.println("----------------------------------------------");
        System.out.println("Promedio del curso: " + estadistica.cursoProm());
        System.out.println("Moda de los semestres: " + estadistica.modaSemestre());
        System.out.println("Cantidad de estudiantes que perdieron el curso: " + estadistica.estudiantesPerdieron());
        System.out.println("Cantidad de estudiantes que ganaron el curso: " + estadistica.estudiantesGanaron());
        scanner.close();
    }
}
