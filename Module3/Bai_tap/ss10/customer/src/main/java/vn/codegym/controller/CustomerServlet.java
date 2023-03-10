package vn.codegym.controller;

import vn.codegym.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(1, "Mai Văn Hoàn", "1983-08-20", "Hà Giang", "https://static.wikia.nocookie.net/reborn/images/8/8d/Tsuna_2.PNG"));
        customerList.add(new Customer(2, "Nguyễn Văn Nam", "1983-08-20", "Bắc Ninh", "https://static.wikia.nocookie.net/reborn/images/8/8d/Tsuna_2.PNG"));
        customerList.add(new Customer(3, "Nguyễn Thái Hòa", "1983-08-20", "Nam Định", "https://static.wikia.nocookie.net/reborn/images/8/8d/Tsuna_2.PNG"));
        customerList.add(new Customer(4, "Tần Đăng Khoa", "1983-08-20", "Hà Tây", "https://static.wikia.nocookie.net/reborn/images/8/8d/Tsuna_2.PNG"));
        customerList.add(new Customer(5, "Nguễn Đình Thi", "1983-08-20", "Hà Nội", "https://static.wikia.nocookie.net/reborn/images/8/8d/Tsuna_2.PNG"));

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
        request.setAttribute("customerList", customerList);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

