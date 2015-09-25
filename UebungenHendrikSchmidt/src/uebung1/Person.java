package uebung1;

class Person {
    private String vorname, nachname;
    private int alter;
    
    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;        
    }
    
    @Override
    public String toString () {
        return vorname + " " + nachname + " " + alter;
    }
    
}


