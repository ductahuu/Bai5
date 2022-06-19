public class Room {
    protected String loaiPhong;
    protected int giaPhong;

    public Room() {
    }

    public Room(String loaiPhong, int giaPhong) {
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "Room{" +
                "loaiPhong='" + loaiPhong + '\'' +
                ", giaPhong=" + giaPhong +
                '}';
    }
}
