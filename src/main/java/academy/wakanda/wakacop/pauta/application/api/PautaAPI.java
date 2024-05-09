package academy.wakanda.wakacop.pauta.application.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaAPI {
    @PostMapping
    PautaCadastradaResponse cadastroPauta(@RequestBody NovaPautaRequest novaPauta);
}
