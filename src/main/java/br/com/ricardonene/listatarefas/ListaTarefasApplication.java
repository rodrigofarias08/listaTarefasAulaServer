package br.com.ricardonene.listatarefas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ricardonene.listatarefas.domain.Tarefa;
import br.com.ricardonene.listatarefas.repositories.TarefaRepository;

@SpringBootApplication
public class ListaTarefasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ListaTarefasApplication.class, args);
	}

	@Autowired
	private TarefaRepository tarefaRepository;

	@Override
	public void run(String... args) throws Exception {

		Tarefa t1 = new Tarefa(1, "Fazer chamada", false);
		Tarefa t2 = new Tarefa(2, "Cozinhar", false);
		Tarefa t3 = new Tarefa(3, "Comprar Café", false);
		Tarefa t4 = new Tarefa(4, "Comprar CD", false);
		tarefaRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
