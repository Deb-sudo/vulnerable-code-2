// Vulnerable Java servlet code snippet
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComplexVulnerableExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("file");
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        // Read and display the file contents
        // ...

        String command = request.getParameter("cmd");
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        // Read and display the command output
        // ...
    }
}
