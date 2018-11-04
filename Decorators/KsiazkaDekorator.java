package Decorators;

import Interface.IPublikacja;

abstract class KsiazkaDekorator implements IPublikacja {
    protected IPublikacja dekorowanaKsiazka;

    public KsiazkaDekorator(IPublikacja dekorowanaKsiazka) {
        this.dekorowanaKsiazka = dekorowanaKsiazka;
    }
}
