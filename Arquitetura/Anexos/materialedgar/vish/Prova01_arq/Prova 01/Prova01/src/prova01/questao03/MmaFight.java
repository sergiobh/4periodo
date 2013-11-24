/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01.questao03;

/**
 *
 * @author edgard.cardoso
 */
public class MmaFight {

    public static String JIU_JITSU = "jiu_jitsu";
    public static String KRAV_MAGA = "krav_maga";
    public static String KICK_BOXING = "kickboxing";

    public static enum Lutador {
        AndersonSilva, VitorBelfort
    }

    public static enum Golpe {
        soco, chute, finalizacao
    }

    public void executarGolpe(Lutador lutador, String arteMacial, Golpe golpe) {
        switch (lutador) {
            case AndersonSilva:
                System.out.print("Anderson Silva executa ");
                if (arteMacial.equals(JIU_JITSU)) {
                    switch (golpe) {
                        case soco:
                            System.out.println("soco do jiu jitsu");
                            break;
                        case chute:
                            System.out.println("chute do jiu jitsu");
                            break;
                        case finalizacao:
                            System.out.println("finalizacao do jiu jitsu");
                            break;
                    }
                } else if (arteMacial.equals(KRAV_MAGA)) {
                    switch (golpe) {
                        case soco:
                            System.out.println("soco do krav maga");
                            break;
                        case chute:
                            System.out.println("chute do krav maga");
                            break;
                        case finalizacao:
                            System.out.println("finalizacao do krav maga");
                            break;
                    }
                } else if (arteMacial.equals(KICK_BOXING)) {
                    switch (golpe) {
                        case soco:
                            System.out.println("soco do kickboxing");
                            break;
                        case chute:
                            System.out.println("chute do kickboxing");
                            break;
                        case finalizacao:
                            System.out.println("finalizacao do kickboxing");
                            break;
                    }
                }
                break;
            case VitorBelfort:
                System.out.print("Vitor Belfort executa ");
                if (arteMacial.equals(JIU_JITSU)) {
                    switch (golpe) {
                        case soco:
                            System.out.println("soco do jiu jitsu");
                            break;
                        case chute:
                            System.out.println("chute do jiu jitsu");
                            break;
                        case finalizacao:
                            System.out.println("finalizacao do jiu jitsu");
                            break;
                    }
                } else if (arteMacial.equals(KRAV_MAGA)) {
                    switch (golpe) {
                        case soco:
                            System.out.println("soco do krav maga");
                            break;
                        case chute:
                            System.out.println("chute do krav maga");
                            break;
                        case finalizacao:
                            System.out.println("finalizacao do krav maga");
                            break;
                    }
                } else if (arteMacial.equals(KICK_BOXING)) {
                    switch (golpe) {
                        case soco:
                            System.out.println("soco do kickboxing");
                            break;
                        case chute:
                            System.out.println("chute do kickboxing");
                            break;
                        case finalizacao:
                            System.out.println("finalizacao do kickboxing");
                            break;
                    }
                }
                break;
        }
    }
}
