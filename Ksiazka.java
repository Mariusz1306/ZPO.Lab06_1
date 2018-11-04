import Interface.IPublikacja;

public class Ksiazka implements IPublikacja {

    private String autor;
    private String tytul;
    private int liczbaStron;

    public Ksiazka(String autor, String tytul, int liczbaStron) {
        this.autor = autor;
        this.tytul = tytul;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTytul() {
        return tytul;
    }

    @Override
    public int getLiczbaStron() {
        return liczbaStron;
    }

    public String toString(){
        return " | " + this.autor + " | " + this.tytul + " | " + this.liczbaStron + " | ";
    }
}
