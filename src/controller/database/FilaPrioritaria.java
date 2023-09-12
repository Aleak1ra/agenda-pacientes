
package controller.database;

import java.util.PriorityQueue;

import java.util.PriorityQueue;
import model.Paciente;

public class FilaPrioritaria {
    private PriorityQueue<Paciente> fila;

    public FilaPrioritaria() {
        fila = new PriorityQueue<>(new PacienteComparator()); // PacienteComparator deve ser uma classe que implementa a comparação de prioridades
    }

    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente);
    }

    public Paciente atenderProximoPaciente() {
        return fila.poll();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }
}
