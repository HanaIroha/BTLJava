package Model;

import DAO.implement.PhongBan;
import DAO.implement.ChucVu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iroha
 */
public class HoSoTableModel extends AbstractTableModel{

    private String name[] = {"Mã nhân sự", "Họ tên", "Giới tính", "Trình độ học vấn", "Chuyên ngành", "Phòng ban", "Chức vụ"};
    private Class classes[] = {String.class, String.class, String.class, String.class, String.class ,String.class, String.class};
    
    ArrayList<NhanSuModel> dsHoSo = new ArrayList<>();

    public HoSoTableModel(ArrayList<NhanSuModel> list) {
        this.dsHoSo = list;
    }
    
    public HoSoTableModel(List<NhanSuModel> list){
        this.dsHoSo = new ArrayList<NhanSuModel>(list);
    }
    
    @Override
    public int getRowCount() {
        return dsHoSo.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsHoSo.get(rowIndex).getMaNS();
            case 1: return dsHoSo.get(rowIndex).getHoTen();
            case 2: return dsHoSo.get(rowIndex).isGioiTinh()?"Nam":"Nữ";
            case 3: return dsHoSo.get(rowIndex).getTrinhDoHocVan();
            case 4: return dsHoSo.get(rowIndex).getChuyenNganh();
            case 5: return new PhongBan().timTenPB(dsHoSo.get(rowIndex).getMaPB());
            case 6: return new ChucVu().TimTenChucVu(dsHoSo.get(rowIndex).getMaCV());
            default: return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
}
