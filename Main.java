import Decorators.KsiazkaZAutografem;
import Decorators.KsiazkaZObwoluta;
import Decorators.KsiazkaZOkladkaTwarda;
import Decorators.KsiazkaZOkladkaZwykla;
import Interface.IPublikacja;

public class Main {
    public static void main(String[] args) {
        IPublikacja ksiazka = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        System.out.println(ksiazka);
        IPublikacja ksiazkaZwykla = new KsiazkaZOkladkaZwykla(ksiazka);
        System.out.println(ksiazkaZwykla);
        IPublikacja ksiazkaTwarda = new KsiazkaZOkladkaTwarda(ksiazka);
        System.out.println(ksiazkaTwarda);

        //Interface.IPublikacja dwieOkladki = new Decorators.KsiazkaZOkladkaTwarda(ksiazkaZwykla);

        IPublikacja ksiazkaZwyklaObwoluta = new KsiazkaZObwoluta(ksiazkaZwykla);
        System.out.println(ksiazkaZwyklaObwoluta);
        IPublikacja ksiazkaTwardaObwoluta = new KsiazkaZObwoluta(ksiazkaTwarda);
        System.out.println(ksiazkaTwardaObwoluta);

        //Interface.IPublikacja obwolutaBezOkladki = new Decorators.KsiazkaZObwoluta(ksiazka);
        //Interface.IPublikacja dwieObwoluty = new Decorators.KsiazkaZObwoluta(ksiazkaZwyklaObwoluta);

        IPublikacja ksiazkaZwyklaObwolutaAutograf = new KsiazkaZAutografem(ksiazkaZwyklaObwoluta, "$zwykla_obwoluta$");
        System.out.println(ksiazkaZwyklaObwolutaAutograf);
        IPublikacja ksiazkaTwardaObwolutaAutograf = new KsiazkaZAutografem(ksiazkaTwardaObwoluta, "$twarda_obwoluta$");
        System.out.println(ksiazkaTwardaObwolutaAutograf);
        IPublikacja ksiazkaZwyklaAutograf = new KsiazkaZAutografem(ksiazkaZwykla, "$zwykla$");
        System.out.println(ksiazkaZwyklaAutograf);
        IPublikacja ksiazkaTwardaAutograf = new KsiazkaZAutografem(ksiazkaTwarda, "$twarda$");
        System.out.println(ksiazkaTwardaAutograf);
        IPublikacja ksiazkaAutograf = new KsiazkaZAutografem(ksiazka, "$brak okladki$");
        System.out.println(ksiazkaAutograf);

        //Interface.IPublikacja dwaAutografy = new Decorators.KsiazkaZAutografem(ksiazkaAutograf, "$drugi autograf$");

    }
}
