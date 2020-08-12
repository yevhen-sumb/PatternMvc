package model;

public class Librarian {
    int idLibrarian;
    String nameLibrarian;
    String positionLibrarian; //должность

    public Librarian() {
    }

    public Librarian(int idLibrarian, String nameLibrarian, String positionLibrarian) {
        this.idLibrarian = idLibrarian;
        this.nameLibrarian = nameLibrarian;
        this.positionLibrarian = positionLibrarian;
    }

    public int getIdLibrarian() {
        return idLibrarian;
    }

    public void setIdLibrarian(int idLibrarian) {
        this.idLibrarian = idLibrarian;
    }

    public String getNameLibrarian() {
        return nameLibrarian;
    }

    public void setNameLibrarian(String nameLibrarian) {
        this.nameLibrarian = nameLibrarian;
    }

    public String getPositionLibrarian() {
        return positionLibrarian;
    }

    public void setPositionLibrarian(String positionLibrarian) {
        this.positionLibrarian = positionLibrarian;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "idLibrarian=" + idLibrarian +
                ", nameLibrarian='" + nameLibrarian + '\'' +
                ", positionLibrarian='" + positionLibrarian + '\'' +
                '}';
    }
}
