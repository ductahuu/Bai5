public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String soCmnd;

    private Room room;

    private int soNgayThue;

    public Nguoi(String hoTen, int tuoi, String soCmnd, Room room, int soNgayThue) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCmnd = soCmnd;
        this.room = room;
        this.soNgayThue = soNgayThue;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", soCmnd='" + soCmnd + '\'' +
                ", room=" + room +
                ", soNgayThue=" + soNgayThue +
                '}';
    }
}
