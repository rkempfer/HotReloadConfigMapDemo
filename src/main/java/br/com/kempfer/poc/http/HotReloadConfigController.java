package br.com.kempfer.poc.http;

import br.com.kempfer.poc.config.GreetingsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotReloadConfigController {

    @Autowired
    private GreetingsConfig greetingsConfig;

    @GetMapping
    public String load() {
        return greetingsConfig.getMessage();
    }


}
