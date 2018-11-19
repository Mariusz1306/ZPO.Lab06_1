package Wydawnictwa;

import Books.Ksiazka;

public abstract class Wydawnictwo {
    public static Wydawnictwo getInstance(String autor) {
        if (autor.equals("Józef Ignacy Kraszewski"))
            return new WydawnictwoPowiesciHistorycznych(autor);
        else if (autor.equals("Michael Jackson"))
            return new WydawnictwoThrillerow(autor);
        else if (autor.equals("Dante"))
            return new WydawnictwoPoematow(autor);
        else
            return null;
    }


    public abstract Ksiazka createBook(String tytul, int liczbaStron);
}