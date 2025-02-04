public class Lift implements IRuangan, IBergerak{
//    public class Lift extends Karyawan implements IRuangan{
//    bisa extend, bisa implements
    public int maxCapacity;
    public int jmlOrang;
    public boolean isMoving;
    public int jmlLantai;
    public int posisi;

    @Override
    public boolean canMove(String arah) {
        if (arah == "Naik"){
            if(posisi < jmlLantai){
                return true;
            }
        }
        else if (arah == "Turun"){
            if (posisi > 1){
                return true;
            }
        }
        return false;
    }

    public boolean dapatDiBuka(){
        return !isMoving;
    }

    public int sisaKapasitas(){
        return maxCapacity-jmlOrang;
    }
}
