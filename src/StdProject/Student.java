package StdProject;

public class Student{
    private int idNumber;
    private String name;

    private int contactNumber;
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
   
    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    public Student(int idNumber, String name,  int contactNumber) {
        this.idNumber = idNumber;
        this.name = name;
      
        this.contactNumber = contactNumber;
    }
    @Override
    public String toString() {
        return "Student [idNumber=" + idNumber + ", name=" + name + ", contactNumber=" + contactNumber
                + "]";
    }

}