public class Book extends LibraryItem{


    private String ISBN;

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN(String ISBN) {
        this.ISBN = ISBN;
        return ISBN;
    }





    @Override
    public String getDescription() {
        String s = "Titlu: " + title +" \n" + "Autor: " + author + " \n" + "ISBN: " + ISBN;
        return s;
    }
}
