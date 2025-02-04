package package2;

public class Account {
    public String username;
    private String password;
    public void printName(){
        System.out.println(username);
    }


    public void setPassword(String password){

        // method enkripsinya
        password += "12345";
        this.password = password;
    }

    public String getPassword(){
        String originalPwd = password.replace("12345","");
        return originalPwd;
    }
}



