package Wydawnictwa;

import Books.Ksiazka;
import Books.PowiescHistoryczna;

public class WydawnictwoPowiesciHistorycznych extends Wydawnictwo{

    protected String autor;

    public WydawnictwoPowiesciHistorycznych(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public Ksiazka createBook(String tytul, int liczbaStron) {
        return new PowiescHistoryczna(this.getAutor(), tytul, liczbaStron);
    }
}
