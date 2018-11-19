package Wydawnictwa;

import Books.Ksiazka;
import Books.Poemat;


public class WydawnictwoPoematow extends Wydawnictwo{

    protected String autor;

    public WydawnictwoPoematow(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public Ksiazka createBook(String tytul, int liczbaStron) {
        return new Poemat(this.getAutor(), tytul, liczbaStron);
    }
}
