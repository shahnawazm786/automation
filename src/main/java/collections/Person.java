package collections;

public class Person {
    private int personid;
    private String name;
    private String address;
    public int getPersonId() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Person(int personid,String name,String address){
        this.personid=personid;
        this.name=name;
        this.address=address;
    }
}
