
public class Case {
    private int id;
    private String title;
    private String client;
    private String date;

    public Case (int id, String title, String client, String date ) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.date = date;
    }

    // TODO: 补全 getter 方法

    public int getId() {
        return id;
    }

    public String getClient() {
        return client;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    // TODO: 补全 toString 方法（用于打印案件信息）

    @Override
    public String toString() {
        return "案件信息：{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", client='" + client + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
