package br.com.ricardonene.listatarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ricardonene.listatarefas.domain.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
