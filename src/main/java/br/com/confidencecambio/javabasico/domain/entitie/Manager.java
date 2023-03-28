package br.com.confidencecambio.javabasico.domain.entitie;



import org.apache.commons.lang3.StringUtils;

public class Manager {

    private String name;

    public Manager() {

    }

    public Manager(String name) {
        this.name = validate(name);
    }

    public void setName(String name) {
        this.name = validate(name);
    }

    public String firstName() {
        return this.name.split(" ")[0];
    }

    public String lastName() {
        String[] splitLast = this.name.split(" ");
        return splitLast[splitLast.length - 1];
    }

    public String nameToUpperCase() {
        return this.name.toUpperCase();
    }

    public String Abreviatte() {
        String midle = " ";
        String[] names = this.name.split(" ");
        for (int i = 1; i < names.length - 1; i++) {
            if (!names[i].equalsIgnoreCase("de") && !names[i].equalsIgnoreCase("da")
                    && !names[i].equalsIgnoreCase("do")
                    && !names[i].equalsIgnoreCase("das")
                    && !names[i].equalsIgnoreCase("dos"))

                midle += names[i].charAt(0) + ". ";
        }
        return names[0] + midle + names[names.length - 1];
    }

    private String validate(String name) {

        if (!StringUtils.isBlank(name)) {
            return name.trim();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
