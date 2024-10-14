import java.util.*;;

class Enterprise {
    String code;
    String name;
    int students;

    public Enterprise(String code, String name, int students) {
        this.code = code;
        this.name = name;
        this.students = students;
    }
}

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); 
        List<Enterprise> enterprises = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String code = scanner.nextLine().trim();
            String name = scanner.nextLine().trim();
            int students = Integer.parseInt(scanner.nextLine().trim());
            enterprises.add(new Enterprise(code, name, students));
        }

        Collections.sort(enterprises, new Comparator<Enterprise>() {
            @Override
            public int compare(Enterprise e1, Enterprise e2) {
                if (e1.students != e2.students) {
                    return Integer.compare(e2.students, e1.students);
                } else {
                    return e1.code.compareTo(e2.code);
                }
            }
        });

        for (Enterprise enterprise : enterprises) {
            System.out.printf("%s %s %d%n", enterprise.code, enterprise.name, enterprise.students);
        }

        scanner.close();
    }
}
