package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet(name = "Servlet13", urlPatterns = {"/Servlet13"})
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Path path1 = Paths.get("/Users/arturszczepanek/workspace/Homeworks/Homework3Test/src/main/java/pl/coderslab/oop.txt");
        try {
            for (String line : Files.readAllLines(path1)) {
                response.getWriter().append(line + "<br>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
