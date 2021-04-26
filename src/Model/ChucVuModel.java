package Model;

/**
 *
 * @author Iroha
 */
public class ChucVuModel {
    private String MaCV, tenCV;

    public ChucVuModel() {
    }

    public ChucVuModel(String MaCV, String tenCV) {
        this.MaCV = MaCV;
        this.tenCV = tenCV;
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
    
}
