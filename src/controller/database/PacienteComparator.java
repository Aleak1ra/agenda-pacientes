/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.database;

import java.util.Comparator;
import model.Paciente;

public class PacienteComparator implements Comparator<Paciente> {
    @Override
    public int compare(Paciente paciente1, Paciente paciente2) {
        // Comparar com base na prioridade (quanto menor, maior a prioridade)
        return Integer.compare(paciente1.getPrioridade(), paciente2.getPrioridade());
    }
}
