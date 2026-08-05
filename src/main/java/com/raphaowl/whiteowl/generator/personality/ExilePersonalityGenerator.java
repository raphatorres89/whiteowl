package com.raphaowl.whiteowl.generator.personality;

import java.util.List;

import com.raphaowl.whiteowl.enums.BackgroundEnum;

import org.springframework.stereotype.Service;

@Service
public class ExilePersonalityGenerator
        extends AbstractBackgroundPersonalityGenerator {

    private static final List<String> TEMPERAMENTS = List.of(
            "reservado",
            "melancólico",
            "determinado",
            "resiliente",
            "cauteloso",
            "paciente",
            "independente",
            "introspectivo"
    );

    private static final List<String> SOCIAL = List.of(
            "demora para confiar nas pessoas",
            "prefere observar antes de agir",
            "evita falar sobre seu passado",
            "valoriza profundamente amizades verdadeiras",
            "mantém certa distância emocional",
            "ouve muito mais do que fala",
            "está sempre atento ao ambiente",
            "protege aqueles que considera sua nova família"
    );

    private static final List<String> VIRTUES = List.of(
            "resiliência",
            "lealdade",
            "paciência",
            "autocontrole",
            "sabedoria",
            "determinação",
            "prudência",
            "compaixão"
    );

    private static final List<String> FLAWS = List.of(
            "guarda rancor por muito tempo",
            "tem dificuldade em confiar",
            "culpa a si mesmo pelo passado",
            "é excessivamente cauteloso",
            "evita criar laços profundos",
            "vive preso às antigas lembranças",
            "tem dificuldade em pedir ajuda",
            "afasta pessoas para evitar sofrimento"
    );

    private static final List<String> HABITS = List.of(
            "observa o horizonte por longos períodos",
            "carrega uma lembrança de sua terra natal",
            "prefere dormir próximo às saídas",
            "fala pouco sobre sua origem",
            "guarda cuidadosamente objetos antigos",
            "fica em silêncio quando pensa no passado",
            "costuma caminhar sozinho",
            "olha constantemente para trás durante viagens"
    );

    private static final List<String> FEARS = List.of(
            "jamais encontrar um novo lar",
            "ser rejeitado novamente",
            "perder as poucas pessoas que ama",
            "esquecer suas origens",
            "ser perseguido por antigos inimigos",
            "fracassar ao tentar recomeçar",
            "nunca conseguir redenção",
            "ver inocentes sofrerem o mesmo destino"
    );

    private static final List<String> GOALS = List.of(
            "encontrar um lugar para chamar de lar",
            "recuperar sua honra",
            "vingar a destruição de sua terra",
            "proteger aqueles que vivem o mesmo destino",
            "descobrir a verdade sobre seu exílio",
            "reconstruir sua antiga vida",
            "provar seu valor ao mundo",
            "encontrar paz consigo mesmo"
    );

    @Override
    public BackgroundEnum background() {
        return BackgroundEnum.EXILE;
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
