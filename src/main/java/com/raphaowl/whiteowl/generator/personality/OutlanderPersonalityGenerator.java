package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class OutlanderPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "independente",
            "calmo",
            "determinado",
            "resiliente",
            "aventureiro",
            "prudente",
            "observador",
            "paciente"
    );

    private static final List<String> SOCIAL = List.of(
            "prefere ouvir antes de falar",
            "sente-se mais confortável ao ar livre do que em cidades",
            "valoriza companheiros leais acima de qualquer riqueza",
            "fala de forma direta e objetiva",
            "costuma observar o ambiente antes de agir",
            "respeita profundamente outras culturas",
            "demonstra carinho através de ações, não de palavras",
            "gosta de compartilhar histórias de suas viagens"
    );

    private static final List<String> VIRTUES = List.of(
            "autossuficiência",
            "coragem",
            "perseverança",
            "lealdade",
            "resiliência",
            "prudência",
            "adaptabilidade",
            "respeito pela natureza"
    );

    private static final List<String> FLAWS = List.of(
            "desconfia de grandes cidades",
            "tem dificuldade em aceitar autoridade",
            "prefere resolver tudo sozinho",
            "é excessivamente reservado",
            "ignora convenções sociais",
            "subestima pessoas sem experiência na natureza",
            "tem dificuldade em permanecer no mesmo lugar",
            "evita pedir ajuda"
    );

    private static final List<String> HABITS = List.of(
            "observa constantemente rastros e pegadas",
            "identifica automaticamente plantas úteis",
            "costuma dormir próximo à fogueira",
            "afia suas ferramentas diariamente",
            "analisa a direção do vento antes de partir",
            "guarda pequenas lembranças de cada lugar visitado",
            "mantém o equipamento sempre pronto",
            "olha frequentemente para o horizonte"
    );

    private static final List<String> FEARS = List.of(
            "ficar preso em uma cidade por muito tempo",
            "ver a natureza destruída",
            "não conseguir proteger seus companheiros",
            "perder sua liberdade",
            "ser incapaz de sobreviver sozinho",
            "esquecer suas origens",
            "fracassar durante uma expedição",
            "ser separado da natureza"
    );

    private static final List<String> GOALS = List.of(
            "explorar terras desconhecidas",
            "mapear regiões inexploradas",
            "descobrir uma civilização perdida",
            "viver completamente livre",
            "proteger as terras selvagens",
            "encontrar uma criatura lendária",
            "desvendar antigos caminhos esquecidos",
            "deixar seu nome entre os maiores exploradores"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.OUTLANDER;
    }

    @Override
    public Personality generate(CharacterContext context) {

        return build(
                TEMPERAMENTS,
                SOCIAL,
                VIRTUES,
                FLAWS,
                HABITS,
                FEARS,
                GOALS
        );

    }

}
