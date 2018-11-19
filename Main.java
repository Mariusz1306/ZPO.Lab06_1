import Books.Ksiazka;
import Decorators.KsiazkaZAutografem;
import Decorators.KsiazkaZObwoluta;
import Decorators.KsiazkaZOkladkaTwarda;
import Decorators.KsiazkaZOkladkaZwykla;
import Interface.IPublikacja;
import Wydawnictwa.Wydawnictwo;

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

        Wydawnictwo wydawnictwoPowiesciHistroycznych = Wydawnictwo.getInstance("Józef Ignacy Kraszewski");
        Ksiazka powiescHistoryczna = wydawnictwoPowiesciHistroycznych.createBook("Masław", 280);
        System.out.println(powiescHistoryczna);
        Wydawnictwo wydawnictwoThillerow = Wydawnictwo.getInstance("Michael Jackson");
        Ksiazka thriller = wydawnictwoThillerow.createBook("Thriller", 880);
        System.out.println(thriller);
        Wydawnictwo wydawnictwoPoematow = Wydawnictwo.getInstance("Dante");
        Ksiazka poemat = wydawnictwoPoematow.createBook("Divine Comedy", 300 );
        System.out.println(poemat);
        KsiazkaZAutografem thrillerTwardaObwolutaAutograf = new KsiazkaZAutografem(
                new KsiazkaZObwoluta(
                        new KsiazkaZOkladkaTwarda(thriller)), "'Cause this is thriller");
        System.out.println(thrillerTwardaObwolutaAutograf);

    }
}
