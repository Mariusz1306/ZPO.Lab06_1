package Wydawnictwa;

import Books.Ksiazka;
import Books.Thriller;

public class WydawnictwoThrillerow extends Wydawnictwo{

    protected String autor;

    public WydawnictwoThrillerow(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public Ksiazka createBook(String tytul, int liczbaStron) {
        return new Thriller(this.getAutor(), tytul, liczbaStron);
    }
}
