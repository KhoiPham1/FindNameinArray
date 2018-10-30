import java.util.Scanner;

public class FindNameinArray {
    public static void main(String[] args) {
        String [] students = {"Khoi","Dat","Phuong","Ngoc","Chinh","DucAnh","Vinh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExit = true;
        for (int i = 0; i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list "+ input_name + " is " + (i+1));
                isExit = false;
                break;
            }
        }
        if (isExit){
            System.out.println("Not found "+ input_name+ " in the list");
        }

    }
}
