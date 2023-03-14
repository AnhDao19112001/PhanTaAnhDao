package vn.codegym.controller;

import vn.codegym.model.User;
import vn.codegym.service.IUserService;
import vn.codegym.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    IUserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null){
            actionUser = "";
        }
        switch (actionUser){
            case "add":
                performAdd(request, response);
                break;
            case "update":
                performUpdate(request, response);
                break;
            case "delete":
                performDelete(request, response);
                break;
            default:
                break;
        }
    }

    private void performDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        User user = userService.findById(id);
        userService.delete(user);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void performUpdate(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.findById(id);
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
        userService.update(user);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void performAdd(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        userService.add(user);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String actionUser = request.getParameter("actionUser");
        if (actionUser == null){
            actionUser = "";
        }
            switch (actionUser) {
                case "add":
                    showAddForm (request, response);
                    break;
                case "update":
                    showUpdateForm (request, response);
                    break;
                default:
                    showListUser (request, response);
                    break;
            }
        }

    private void showListUser(HttpServletRequest request, HttpServletResponse response) {
        String countryName = request.getParameter("countryName");
        request.setAttribute("countryName", countryName);
        List<User> userList = userService.listAll(countryName);
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.findById(id);
        request.setAttribute("user", user);
        try {
            request.getRequestDispatcher("/view/update.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        userService.add(user);
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}