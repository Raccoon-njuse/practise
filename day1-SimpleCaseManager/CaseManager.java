
import java.util.ArrayList;
import java.util.Iterator;

public class CaseManager {
    private ArrayList<Case> cases = new ArrayList<>();
    private int idCounter = 1;

    public void addCase(String title, String client, String date) {
        Case newCase = new Case(idCounter++, title, client, date);
        cases.add(newCase);
        System.out.println("✅ 案件已添加！");
    }

    public void deleteCase(int id) {
        Iterator<Case> iterator = cases.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Case c = iterator.next();
            if (c.getId() == id) {
                iterator.remove();
                System.out.println("✅ 案件已删除！");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("⚠️ 未找到该案件！");
        }
    }

    public void listCases() {
        if (cases.isEmpty()) {
            System.out.println("📭 暂无案件记录！");
            return;
        }
        for (Case c : cases) {
            System.out.println(c);
        }
    }
}
