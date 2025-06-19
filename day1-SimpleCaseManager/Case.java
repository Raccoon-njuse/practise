
public class Case {
    private int id;
    private String title;
    private String client;
    private String date;

    public Case(int id, String title, String client, String date) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "案件编号: " + id + ", 标题: " + title + ", 当事人: " + client + ", 日期: " + date;
    }
}
