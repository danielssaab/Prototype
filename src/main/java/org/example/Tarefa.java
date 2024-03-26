package org.example;
import java.util.ArrayList;
import java.util.List;

public class Tarefa implements Cloneable {
	private String nome;
	private Responsavel responsavel;
	private List<Tarefa> subTarefas;

	public Tarefa(String nome, Responsavel responsavel) {
		this.nome = nome;
		this.responsavel = responsavel;
		this.subTarefas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void adicionarSubTarefa(Tarefa subTarefa) {
		subTarefas.add(subTarefa);
	}

	public List<Tarefa> getSubTarefas() {
		return new ArrayList<>(subTarefas);
	}

	@Override
	public Tarefa clone() throws CloneNotSupportedException {
		Tarefa clone = (Tarefa) super.clone();
		clone.responsavel = this.responsavel.clone();
		clone.subTarefas = new ArrayList<>();
		for (Tarefa subTarefa : this.subTarefas) {
			clone.adicionarSubTarefa(subTarefa.clone());
		}
		return clone;
	}

	@Override
	public String toString() {
		return "Tarefa{" +
			"nome='" + nome + '\'' +
			", responsavel=" + responsavel +
			", subTarefas=" + subTarefas +
			'}';
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}