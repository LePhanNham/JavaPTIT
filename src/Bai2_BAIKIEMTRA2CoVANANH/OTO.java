package Bai2_BAIKIEMTRA2CoVANANH;

public class OTO extends PTGT {
    private String kieudongco;
    private int sochongoi;

    public OTO(String ma, String hangsx, int namsx, int giaban, String mau,String kieudongco, int sochongoi) {
        super(ma,hangsx,namsx,giaban,mau);
        this.kieudongco = kieudongco;
        this.sochongoi = sochongoi;
    }
}
