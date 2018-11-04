package Decorators;

import Exceptions.JednaOkladkaException;
import Interface.IPublikacja;

public class KsiazkaZOkladkaTwarda extends KsiazkaDekorator {
    protected String okladka;

    public KsiazkaZOkladkaTwarda(IPublikacja dekorowanaKsiazka) throws JednaOkladkaException {
        super(dekorowanaKsiazka);
        if ((String.valueOf(dekorowanaKsiazka.getClass()).startsWith("class Decorators.KsiazkaZOkladka")))
            throw new JednaOkladkaException("Ksiazka moze miec tylko jedna okladke");
        this.okladka = "Okladka twarda";
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

    public String getOkladka() {
        return okladka;
    }

    public String toString(){
        return dekorowanaKsiazka.toString() + this.getOkladka() + " | ";
    }
}

