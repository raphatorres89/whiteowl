package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class GuildMemberPersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "disciplinado",
            "organizado",
            "confiável",
            "ambicioso",
            "metódico",
            "pragmático",
            "persistente",
            "respeitoso"
    );

    private static final List<String> SOCIAL = List.of(
            "valoriza relações profissionais duradouras",
            "trata todos com educação e respeito",
            "gosta de compartilhar conhecimento",
            "costuma agir como mediador em conflitos",
            "procura criar contatos importantes",
            "fala de maneira objetiva",
            "respeita hierarquias estabelecidas",
            "prefere resolver problemas através da cooperação"
    );

    private static final List<String> VIRTUES = List.of(
            "disciplina",
            "lealdade",
            "responsabilidade",
            "honestidade",
            "cooperação",
            "dedicação",
            "profissionalismo",
            "comprometimento"
    );

    private static final List<String> FLAWS = List.of(
            "confia demais nas regras",
            "tem dificuldade em improvisar",
            "é competitivo em excesso",
            "leva críticas para o lado pessoal",
            "julga quem não leva o trabalho a sério",
            "tem dificuldade em abandonar tradições",
            "cobra muito de si mesmo",
            "prioriza o dever acima da vida pessoal"
    );

    private static final List<String> HABITS = List.of(
            "mantém seus equipamentos sempre organizados",
            "anota compromissos cuidadosamente",
            "cumprimenta colegas com respeito",
            "observa a qualidade do trabalho alheio",
            "consulta antigos registros antes de decidir",
            "mantém suas ferramentas impecáveis",
            "cumpre horários rigorosamente",
            "costuma revisar seu trabalho duas vezes"
    );

    private static final List<String> FEARS = List.of(
            "manchar a reputação da guilda",
            "falhar diante de seus companheiros",
            "ser expulso da organização",
            "não corresponder às expectativas",
            "ver anos de trabalho desperdiçados",
            "perder o respeito dos colegas",
            "ficar sem propósito profissional",
            "ser substituído facilmente"
    );

    private static final List<String> GOALS = List.of(
            "tornar-se mestre de sua guilda",
            "elevar o prestígio de sua organização",
            "ensinar uma nova geração de aprendizes",
            "construir um legado respeitado",
            "aperfeiçoar sua profissão",
            "fortalecer sua rede de aliados",
            "descobrir técnicas esquecidas",
            "ser reconhecido como referência em seu ofício"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.GUILD_MEMBER;
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
