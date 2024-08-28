import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name="kavindu";
        employee.address="colombo";
        employee.age=23;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Employee created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
