public class Mobil implements IRuangan, IBergerak{
    public int jmlKursi;
    public boolean isLoked;
    public int jmlPenumpang;
    public boolean isMoving;
    public String gear;
    public boolean isBraked;

    @Override
    public boolean dapatDiBuka(){
        if (!isLoked && !isMoving){
            return true;
        }
        return false;
    }

    @Override
    public int sisaKapasitas(){
        return jmlKursi - jmlPenumpang;
    }

    @Override
    public boolean canMove(String arah) {
        if(!isBraked){
            if(arah == "Maju" && gear == "D" ){
                return true;
            }
            else if(arah == "Mundur" && gear == "R"){
                return true;
            }
        }
        return false;
    }
}
