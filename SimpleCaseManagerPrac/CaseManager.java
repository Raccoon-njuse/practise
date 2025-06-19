
import java.util.ArrayList;
import java.util.Iterator;

public class CaseManager {
    private ArrayList<Case> cases = new ArrayList<>();
    private int idCounter = 1;

    public void addCase(String title, String client, String date) {
        // TODO: 补全代码，创建新案件对象并加入 cases 列表
        cases.add(new Case(idCounter++, title, client, date));
        System.out.println("案件已添加！");
    }

    public void deleteCase(int id) {
        // TODO: 补全代码，遍历 cases，根据 id 删除案件
        Iterator<Case> it = cases.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Case c = it.next();
            if (c.getId() == id) {
                it.remove();
                System.out.println("找到案件");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("未找到案件");
        }
    }

    public void listCases() {
        // TODO: 补全代码，遍历并打印所有案件
        for (Case c: cases) {
            System.out.println(c);
        }
    }
}
