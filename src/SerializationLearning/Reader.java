package SerializationLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Employee employee = new Employee();
        FileInputStream fileInputStream = new FileInputStream("/employee.obj");
        ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
        employee = (Employee) objectOutputStream.readObject();

        System.out.println(employee.toString());

    }
}
