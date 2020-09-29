package br.com.kempfer.poc.service;

import br.com.kempfer.poc.domain.Ordem;
import br.com.kempfer.poc.repository.OrdemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ordem")
public class OrdemService {


    @Autowired
    private OrdemRepository ordemRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid  Ordem ordem){
        ordemRepository.insert(ordem);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Ordem> todasOrdems() {
        return ordemRepository.findAll();
    }

}
