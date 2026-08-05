package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class TraderPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "diplomático",
            "paciente",
            "persuasivo",
            "pragmático",
            "ambicioso",
            "observador",
            "otimista",
            "calculista"
    );

    private static final List<String> SOCIAL = List.of(
            "gosta de conhecer pessoas de diferentes culturas",
            "prefere negociar antes de recorrer à força",
            "memoriza facilmente nomes e rostos",
            "sempre encontra um assunto para iniciar uma conversa",
            "trata todos como potenciais parceiros comerciais",
            "escuta atentamente antes de apresentar uma proposta",
            "valoriza relações de confiança duradouras",
            "costuma mediar conflitos entre outras pessoas"
    );

    private static final List<String> VIRTUES = List.of(
            "honestidade",
            "adaptabilidade",
            "paciência",
            "diplomacia",
            "responsabilidade",
            "visão estratégica",
            "generosidade",
            "perseverança"
    );

    private static final List<String> FLAWS = List.of(
            "valoriza dinheiro mais do que deveria",
            "tem dificuldade em recusar uma boa oportunidade",
            "confia demais em acordos verbais",
            "é excessivamente competitivo",
            "costuma calcular tudo em termos de lucro",
            "demora para tomar decisões importantes",
            "subestima pessoas sem recursos",
            "assume riscos financeiros desnecessários"
    );

    private static final List<String> HABITS = List.of(
            "conta moedas distraidamente",
            "anota todas as despesas",
            "observa imediatamente o valor dos objetos ao seu redor",
            "cumprimenta todos cordialmente",
            "costuma negociar até pequenas compras",
            "memoriza rotas comerciais",
            "organiza cuidadosamente sua bagagem",
            "faz cálculos mentalmente com facilidade"
    );

    private static final List<String> FEARS = List.of(
            "perder toda a sua fortuna",
            "ser enganado em uma negociação",
            "falir completamente",
            "não conseguir sustentar sua família",
            "ser roubado durante uma viagem",
            "ver suas mercadorias destruídas",
            "perder sua reputação",
            "ficar preso em um lugar sem oportunidades"
    );

    private static final List<String> GOALS = List.of(
            "construir um império comercial",
            "abrir a maior casa mercante do reino",
            "descobrir novas rotas comerciais",
            "negociar com povos distantes",
            "acumular riqueza suficiente para viver confortavelmente",
            "ser conhecido como um comerciante lendário",
            "financiar grandes expedições",
            "deixar um legado para sua família"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.TRADER;
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
