
import java.io.*;
import java.util.*;

/**
 * 
 */
public class CARRERA {

    /**
     * Default constructor
     */
    public CARRERA() {
    }

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public int númeroCréditosTotales;

    /**
     * 
     */
    public int númeroSemestres;

    /**
     * 
     */
    public String nivel;

    /**
     * 
     */
    public List<Curso> cursos;

    /**
     * 
     */
    public List<Estudiante> estudiantes;

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @param nombre 
     * @return
     */
    public void setNombre(String nombre) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getNúmeroCréditosTotales() {
        // TODO implement here
        return 0;
    }

    /**
     * @param númeroCréditosTotales 
     * @return
     */
    public void setNúmeroCréditosTotales(int númeroCréditosTotales) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getNúmeroSemestres() {
        // TODO implement here
        return 0;
    }

    /**
     * @param númeroSemestres 
     * @return
     */
    public void setNúmeroSemestres(int númeroSemestres) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getNivel() {
        // TODO implement here
        return "";
    }

    /**
     * @param nivel 
     * @return
     */
    public void setNivel(String nivel) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Curso> getCursos() {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public void agregarCurso(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @param curso 
     * @return
     */
    public void eliminarCurso(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Estudiante> getEstudiantes() {
        // TODO implement here
        return null;
    }

    /**
     * @param estudiante 
     * @return
     */
    public void agregarEstudiante(Estudiante estudiante) {
        // TODO implement here
        return null;
    }

    /**
     * @param estudiante 
     * @return
     */
    public void eliminarEstudiante(Estudiante estudiante) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public enum NivelCarrera {
        PreGrado,
        PostGrado
    }

}