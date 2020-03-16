package SerializationLearning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Writer {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();
        employee.setAddress("Patna");
        employee.setAge(24);
        employee.setGroup(4);
        employee.setName("Ankit");

        FileOutputStream fileOutputStream = new FileOutputStream("/employee.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();

    }
}
