package academy.wakanda.wakacop.pauta.application.api;

import academy.wakanda.wakacop.pauta.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PautaController implements PautaAPI {
    private final PautaService pautaService;

    @Override
    public PautaCadastradaResponse cadastroPauta(NovaPautaRequest novaPauta) {
        log.info("[start] PautaController - cadastroPauta");
        PautaCadastradaResponse pautaCadastrada = pautaService.cadastraPauta(novaPauta);
        log.info("[finish] PautaController - cadastroPauta");
        return pautaCadastrada;
    }
}
