package ru.sl.q35_q39;

public class GetSet {
    private String name;

    public GetSet() {
    }

    public GetSet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void privPrint() {
        System.out.println("Private Print");
    }

    protected void protPrint() {
        System.out.println("Protected Print");
    }

    static void statPrint() {
        System.out.println("Static Print");
    }
}

class SubCl extends GetSet {
    public static void main(String[] args) {
        SubCl subCl=new SubCl();
        subCl.protPrint();
//        subCl.privPrint();
        statPrint();

        GetSet getSet=new GetSet("asd");
        System.out.println(getSet.getName());
        getSet.setName("===");
        System.out.println(getSet.getName());

    }
}

