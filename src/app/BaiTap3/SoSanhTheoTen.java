package app.BaiTap3;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2){
        return o1.gethoTen().compareTo(o2.gethoTen());
    }
}