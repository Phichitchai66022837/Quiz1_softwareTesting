import java.util.Scanner;

public class quiz01 {

    public boolean NomalGroup(int blood_pressure, int sugar_value) {
        if (blood_pressure <= 120 && sugar_value < 100) {
            System.out.println("Normal Group");
            return true;
        }
        return false;
    }

    public boolean RiskGroup(int blood_pressure, int sugar_value) {
        if (blood_pressure > 120 && blood_pressure <= 139 && sugar_value >= 100 && sugar_value <= 125) {
            System.out.println("Risk Group");
            return true;
        }
        return false;
    }

    public boolean SickGroup(int blood_pressure, int sugar_value) {
        if (blood_pressure >= 140 && blood_pressure <= 159 && sugar_value >= 125 && sugar_value <= 154) {
            System.out.println("SickGroup Level : 1");
            return true;
        } else if (blood_pressure >= 160 && blood_pressure <= 179 && sugar_value >= 155 && sugar_value <= 182) {
            System.out.println("SickGroup Level : 2");
            return true;
        } else if (blood_pressure >= 180 && sugar_value >= 183) {
            System.out.println("SickGroup Level : 3");
            return true;
        }
        return false;
    }

    public boolean MainFunction(int blood_pressure, int sugar_value) {
        boolean isMatched = false;
        isMatched |= NomalGroup(blood_pressure, sugar_value);
        isMatched |= RiskGroup(blood_pressure, sugar_value);
        isMatched |= SickGroup(blood_pressure, sugar_value);
        return isMatched;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        quiz01 quiz = new quiz01();

        boolean isConditionMatched = false;


        while (!isConditionMatched) {
            System.out.print("Enter blood pressure: ");
            int blood_pressure = scanner.nextInt();
            System.out.print("Enter sugar value: ");
            int sugar_value = scanner.nextInt();

            isConditionMatched = quiz.MainFunction(blood_pressure, sugar_value);

            if (!isConditionMatched) {
                System.out.println("The values do not match any condition. Please try again.\n");
            }
        }

        scanner.close();
    }
}
