
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaseManager manager = new CaseManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== 法院案件管理系统 ===");
            System.out.println("1. 添加案件");
            System.out.println("2. 删除案件");
            System.out.println("3. 查看案件");
            System.out.println("0. 退出系统");
            System.out.print("请输入你的选择：");

            choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入案件标题：");
                    String title = scanner.nextLine();
                    System.out.print("请输入当事人姓名：");
                    String client = scanner.nextLine();
                    System.out.print("请输入日期（如2025-06-19）：");
                    String date = scanner.nextLine();
                    manager.addCase(title, client, date);
                    break;
                case 2:
                    System.out.print("请输入要删除的案件编号：");
                    int id = scanner.nextInt();
                    manager.deleteCase(id);
                    break;
                case 3:
                    manager.listCases();
                    break;
                case 0:
                    System.out.println("👋 退出系统，再见！");
                    break;
                default:
                    System.out.println("❌ 无效选择，请重试！");
            }
        } while (choice != 0);

        scanner.close();
    }
}
