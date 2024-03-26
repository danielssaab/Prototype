package org.example;

class Responsavel implements Cloneable {
	private String nome;

	public Responsavel(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public Responsavel clone() throws CloneNotSupportedException {
		return (Responsavel) super.clone();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Responsavel{" +
			"nome='" + nome + '\'' +
			'}';
	}
}