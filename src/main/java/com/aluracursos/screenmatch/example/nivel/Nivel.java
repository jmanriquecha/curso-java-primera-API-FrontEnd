package com.aluracursos.screenmatch.example.nivel;

public enum Nivel {
    Iniciante(1),
    Intermedio(2),
    Avanzado(3);

    private int puntuacion;
    Nivel(int puntuacion){
        this.puntuacion = puntuacion;
    }
}
