package enums;

import interfaces.Printable;

public enum DocumentType implements Printable{
    PDF,
    WORD;

    @Override
    public void print() {
        System.out.println("Printing " +  this);
    }

}
