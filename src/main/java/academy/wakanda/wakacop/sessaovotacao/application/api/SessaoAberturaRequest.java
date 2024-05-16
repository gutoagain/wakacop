package academy.wakanda.wakacop.sessaovotacao.application.api;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;

import java.util.Optional;
import java.util.UUID;

@ToString
public class SessaoAberturaRequest {
    @Getter
    @NotNull
    private UUID idPauta;
    @Getter(AccessLevel.NONE)
    private Integer tempoDuracao;

    public Optional<Integer> getTempoDuracao() {
        return Optional.ofNullable(this.tempoDuracao);
    }
}
