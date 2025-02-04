//import java.security.PublicKey;

//PERTEMUAN 10, ABSTRACT CLASS
public abstract class Student{
    String name;
    String NIM;
    Boolean isActive = true;
    String finalProject;
    String advisor;
    int semester;

    public void ajukanCuti(){
        isActive = false;
    }
    public abstract void dropOut();

//    reguler method, harus di override
//    abstract method ?? , konkret class??
    public abstract void ajukanTugasAkhir(String topik, String pembimbing);




//public class Student {


//    private String name;
//    private String nim;
//    private String address;
//    private int semester;
//    private double ipk;
//    private String SPV;
//    private String supervisor;
//    public void requestSupervisor(String Supervisor){
//
//    }
//
//
//    public String getSPV() {
//        return SPV;
//    }
//
//    public void setSPV(String SPV) {
//        this.SPV = SPV;
//    }
//
//    public void requestSpv(String SPV){
//        if (semester >= 7){
//            this.SPV = SPV;
////            this.setSPV(SPV);
//        }
//    }
//    public void requestSpv(String SPV, String supervisorName ){
//        if (semester >= 7){
//            this.SPV = SPV;
//            this.supervisor = supervisorName;
//        }
//    }
//
//    public void displayStudentReport(){
//        System.out.println("Nilai akhir "  + name + " adalah " + ipk );
//    }
//
//    public void displayStudentReport(boolean includeAdress){
//        if(includeAdress) {
//            System.out.println("Nilai akhir: " + name + " adalah" + ipk + " dengan alamat " + address);
//        } else{
//            displayStudentReport();
//        }
//    }
//    public double getIpk() {
//        return ipk;
//    }
//
//    public void setIpk(double ipk) {
//        this.ipk = ipk;
//    }
//
//    public String getNim() {
//        return nim;
//    }
//
//    public void setNim(String nim) {
//        this.nim = nim;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getSemester() {
//        return semester;
//    }
//
//    public void setSemester(int semester) {
//        this.semester = semester;
//    }

}
