package Decorators;

import Exceptions.BrakOkladkiException;
import Exceptions.JednaObwolutaException;
import Interface.IPublikacja;

public class KsiazkaZObwoluta extends KsiazkaDekorator {
    protected boolean posiadaObwolute;

    public KsiazkaZObwoluta(IPublikacja dekorowanaKsiazka) throws BrakOkladkiException, JednaObwolutaException {
        super(dekorowanaKsiazka);
        if ((String.valueOf(dekorowanaKsiazka.getClass()).startsWith("class Decorators.KsiazkaZObwoluta")))
            throw new JednaObwolutaException("Ksiazka moze miec tylko jedna obwolute");
        if (!(String.valueOf(dekorowanaKsiazka.getClass()).startsWith("class Decorators.KsiazkaZOkladka")))
            throw new BrakOkladkiException("Nie mozna oblozyc obwoluta ksiazki, ktora nie posiada okladki");
        this.posiadaObwolute = true;
    }

    @Override
    public String getAutor() {
        return dekorowanaKsiazka.getAutor();
    }

    @Override
    public String getTytul() {
        return dekorowanaKsiazka.getTytul();
    }

    @Override
    public int getLiczbaStron() {
        return dekorowanaKsiazka.getLiczbaStron();
    }

    public boolean isPosiadaObwolute() {
        return posiadaObwolute;
    }

    public String getPosiadaObwolute() {
        if (isPosiadaObwolute())
            return "posiada obwolute";
        else
            return "nie posiada obwoluty";
    }

    public String toString(){
        return dekorowanaKsiazka.toString() + this.getPosiadaObwolute() + " | ";
    }
}
