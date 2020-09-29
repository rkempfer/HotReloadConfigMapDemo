package br.com.kempfer.poc.repository;

import br.com.kempfer.poc.domain.Ordem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrdemRepository extends MongoRepository<Ordem, String> {

    public List<Ordem> findByAtivo(String ativo);

}
