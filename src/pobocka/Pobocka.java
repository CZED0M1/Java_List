package pobocka;

import java.util.Iterator;
import kolekce.AbstrDoubleList;
import kolekce.EnumPozice;
import prostredky.Auto;

public class Pobocka implements IPobocka {

    private final String jmeno;
    private int pocetAuto = 0;
    private AbstrDoubleList<Auto> seznamAut;

    public Pobocka(String jmeno) {
        this.jmeno = jmeno;
        seznamAut = new AbstrDoubleList<>();
    }

    @Override
    public void vlozAuto(Auto auto, EnumPozice Pozice) {
        switch (Pozice) {
            case NASLEDNIK:
                seznamAut.vlozNaslednika(auto);
                break;
            case POSLEDNI:
                seznamAut.vlozPosledni(auto);
                break;
            case PREDCHUDCE:
                seznamAut.vlozPredchudce(auto);
                break;
            case PRVNI:
                seznamAut.vlozPrvni(auto);
                break;
            default:
                System.out.println("EEE");
        }
        pocetAuto++;
    }

    @Override
    public Auto zpristupnAuto(EnumPozice Pozice) {
        Auto auto = null;
        switch (Pozice) {
            case AKTUALNI:
                auto = seznamAut.zpristupniAktualni();
                break;
            case NASLEDNIK:
                auto = seznamAut.zpristupniNaslednika();
                break;
            case POSLEDNI:
                auto = seznamAut.zpristupniPosledni();
                break;
            case PREDCHUDCE:
                auto = seznamAut.zpristupniPredchudce();
                break;
            case PRVNI:
                auto = seznamAut.zpristupniPrvni();
                break;
            default:
                System.out.println("EEE");
        }
        return auto;
    }

    @Override
    public Auto odeberAuto(EnumPozice Pozice) {
        Auto auto = null;
        switch (Pozice) {
            case AKTUALNI:
                auto = seznamAut.odeberAktualni();
                break;
            case NASLEDNIK:
                auto = seznamAut.odeberNaslednika();
                break;
            case POSLEDNI:
                auto = seznamAut.odeberPosledni();
                break;
            case PREDCHUDCE:
                auto = seznamAut.odeberPredchudce();
                break;
            case PRVNI:
                auto = seznamAut.odeberPrvni();
                break;
            default:
                System.out.println("EEE");
        }
        pocetAuto--;
        return auto;
    }

    @Override
    public Iterator<Auto> iterator() {
        return seznamAut.iterator();
    }

    @Override
    public void zrus() {
        seznamAut.zrus();
        pocetAuto = 0;
    }

    public int getPocetAuto() {
        return pocetAuto;
    }

    public void setPocetAuto(int pocetAuto) {
        this.pocetAuto = pocetAuto;
    }



    
    @Override
    public String toString() {
        return jmeno;
    }

}
