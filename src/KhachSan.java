import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<Nguoi> list;

    public KhachSan() {
        list = new ArrayList<>();
    }

    public void add(Nguoi nguoi) {
        this.list.add(nguoi);
    }

    public boolean delete(String soCmnd) {
        Nguoi person = this.list.stream().filter(p -> p.getSoCmnd().equals(soCmnd)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.list.remove(person);
            return true;
        }
    }

    public int calculator(String soCmnd) {
        Nguoi person = this.list.stream().filter(p -> p.getSoCmnd().equals(soCmnd)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getRoom().getGiaPhong() * person.getSoNgayThue();
    }

    public void show() {
        this.list.forEach(p -> System.out.println(p.toString()));
    }
}
