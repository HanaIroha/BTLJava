package Model;

/**
 *
 * @author Iroha
 */
public class ChucVuModel {
    private String MaCV, tenCV;
    private double PhuCap, LuongCoBan;

    public ChucVuModel() {
    }

    public ChucVuModel(String MaCV, String tenCV, double PhuCap, double LuongCoBan) {
        this.MaCV = MaCV;
        this.tenCV = tenCV;
        this.PhuCap = PhuCap;
        this.LuongCoBan = LuongCoBan;
    }

    public double getPhuCap() {
        return PhuCap;
    }

    public void setPhuCap(double PhuCap) {
        this.PhuCap = PhuCap;
    }

    public String getMaCV() {
        return MaCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public double getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(double LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }
    
}
