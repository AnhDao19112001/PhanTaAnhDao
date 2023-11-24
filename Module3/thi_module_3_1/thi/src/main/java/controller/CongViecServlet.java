package controller;

import model.CongViec;
import service.CongViecService;
import service.ICongViecService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CongViecServlet", value = "/congViec")
public class CongViecServlet extends HttpServlet {
    private ICongViecService iCongViecService = new CongViecService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":

                break;
            case "delete":

                break;
            default:
                List<CongViec> congViecList = iCongViecService.findAll();
                request.setAttribute("congViecList", congViecList);
                request.getRequestDispatcher("/list_TP.jsp").forward(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
