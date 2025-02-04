public class masterStudent extends Student{
    @Override
    public void dropOutStd() {
        if(semester > 8){
            isActive = false;
        }
    }
    //    private String thesesTopic;
//    public String getThesisTopic() {
//        return thesesTopic;
//    }
//    public void proposeTheses(String theses){
//        this.thesesTopic = theses;
//    }
//    public void proposeTheses(String theses, String spv){
//        this.thesesTopic = theses;
//        super.requestSupervisor(spv);
//    }
//
//    public void proposeTheses(String spv, String theses, int smt){
//        if (semester == smt){
//            this.proposeTheses(theses, spv);
//        }
//    }
//
//    public void applyThesisTopic(String thesisTopic) {
//        this.thesesTopic = thesisTopic;
//    }
//    @Override
//    public void requestSpv(String SPV){
//        setSPV(SPV);
//    }

//    Nama methodnya sama, parameternya beda masuk ke overloading, tipe parameternya harus berbeda, dilihat dari tipe dan urutan,
//    meskipun memiliki tipe parameter yang sama tetapi urutan berbeda, maka method akan tetap berbeda

//    contohnya:

    //    public void proposeTheses(String spv, String theses, int smt){
//        if (semester == smt){
//            this.proposeTheses(theses, spv);
//        }
//    }
//    nah kedua method ini berbeda, karena urutan parameter berbeda, meskipun tipe parameternya sama

//public void proposeTheses(int smt, String theses, String spv){
//        if (semester == smt){
//            this.proposeTheses(theses, spv);
//        }
//    }
}
