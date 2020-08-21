package model;

import java.util.ArrayList;

public class Reader {
    int idReader;
    String nameReader;
    ArrayList< Book> listReadBook;

    @Override
    public String toString() {
        return "Reader{" +
                "idReader=" + idReader +
                ", nameReader='" + nameReader + '\'' +
                ", listBook=" + listReadBook +
                '}'+ "\n";
    }


}
