package br.com.ricardonene.listatarefas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricardonene.listatarefas.domain.Tarefa;
import br.com.ricardonene.listatarefas.repositories.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repo;

	public Tarefa findById(Integer id) {
		Optional<Tarefa> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public List<Tarefa> findAll() {
		return repo.findAll();
	}

	public Tarefa insert(Tarefa obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Tarefa update(Tarefa obj) {
		return repo.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		repo.deleteById(id);
	}
}
