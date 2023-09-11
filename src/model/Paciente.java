/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alexandre Gonçalves
 */
import java.util.HashMap;
import java.util.Map;

public class Paciente {
    private int id;
    private String nome;
    private int idade;
    private String diagnostico;
    private int prioridade;

    // Construtor vazio
    public Paciente() {
    }

    // Construtor com parâmetros
    public Paciente(int id, String nome, int idade, String diagnostico, int prioridade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
        this.prioridade = prioridade;
    }

    // Métodos getters e setters para as propriedades
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Método para converter um objeto Paciente em um mapa (estrutura chave-valor)
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("nome", nome);
        map.put("idade", idade);
        map.put("diagnostico", diagnostico);
        map.put("prioridade", prioridade);
        return map;
    }

    // Método para criar um objeto Paciente a partir de um mapa
    public static Paciente fromMap(Map<String, Object> map) {
        Paciente paciente = new Paciente();
        paciente.setId((int) map.get("id"));
        paciente.setNome((String) map.get("nome"));
        paciente.setIdade((int) map.get("idade"));
        paciente.setDiagnostico((String) map.get("diagnostico"));
        paciente.setPrioridade((int) map.get("prioridade"));
        return paciente;
    }

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", diagnostico=" + diagnostico
                + ", prioridade=" + prioridade + "]";
    }
}
