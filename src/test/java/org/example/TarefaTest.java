package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TarefaTest {

	@Test
	void testClone() {
		try {
			Responsavel responsavel = new Responsavel("João");

			Tarefa prototipoTarefa = new Tarefa("Tarefa Principal", responsavel);
			prototipoTarefa.adicionarSubTarefa(new Tarefa("Subtarefa 1", responsavel));
			prototipoTarefa.adicionarSubTarefa(new Tarefa("Subtarefa 2", responsavel));

			Tarefa novaTarefa = prototipoTarefa.clone();

			novaTarefa.getResponsavel().setNome("Maria");

			novaTarefa.setNome("Nova Tarefa");
			
			assertEquals("Tarefa{nome='Tarefa Principal', responsavel=Responsavel{nome='João'}, subTarefas=[Tarefa{nome='Subtarefa 1', responsavel=Responsavel{nome='João'}, subTarefas=[]}, Tarefa{nome='Subtarefa 2', responsavel=Responsavel{nome='João'}, subTarefas=[]}]}", prototipoTarefa.toString());
			assertEquals("Tarefa{nome='Nova Tarefa', responsavel=Responsavel{nome='Maria'}, subTarefas=[Tarefa{nome='Subtarefa 1', responsavel=Responsavel{nome='João'}, subTarefas=[]}, Tarefa{nome='Subtarefa 2', responsavel=Responsavel{nome='João'}, subTarefas=[]}]}", novaTarefa.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
