package Decorators;

import Exceptions.JedenAutografException;
import Interface.IPublikacja;

public class KsiazkaZAutografem extends KsiazkaDekorator {
    protected String autograf;

    public KsiazkaZAutografem(IPublikacja dekorowanaKsiazka, String autograf) throws JedenAutografException {
        super(dekorowanaKsiazka);
        if ((String.valueOf(dekorowanaKsiazka.getClass()).startsWith("class Decorators.KsiazkaZAutografem")))
            throw new JedenAutografException("Autograf może być tylko jeden");
        this.autograf = autograf;
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

    public String getAutograf() {
        return autograf;
    }

    public String toString(){
        return dekorowanaKsiazka.toString() + this.getAutograf() + " | ";
    }
}
