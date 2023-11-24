package controller;
import model.LoaiThucPham;
import model.SieuThi;
import service.ISieuThiService;
import service.SieuThiService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ThucPhamServlet", value = "/thucPham")
public class ThucPhamServlet extends HttpServlet {
    private ISieuThiService iSiuThiService = new SieuThiService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                request.getRequestDispatcher("/view/list.jsp").forward(request,response);
                break;
            case "delete":
                Integer id = Integer.parseInt(request.getParameter("id"));
                iSiuThiService.delete(id);
                request.getRequestDispatcher("/thucPham").forward(request,response);
                break;
            default:
                List<SieuThi> sieuThiList = iSiuThiService.findAll();
                request.setAttribute("sieuThiList",sieuThiList);
                request.getRequestDispatcher("/view/delete.jsp").forward(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }switch (action){
            case "create":
                Integer id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                Integer NSX = Integer.parseInt(request.getParameter("NSX"));
                Integer HSD = Integer.parseInt(request.getParameter("HSD"));
                Integer idLTP = Integer.parseInt(request.getParameter("idLTP"));
                String nameLTP = request.getParameter("nameLTP");
                LoaiThucPham loaiThucPham = new LoaiThucPham(idLTP, nameLTP);
                String moTa = request.getParameter("moTa");
                SieuThi sieuThi = new SieuThi(id,name,NSX,HSD,loaiThucPham,moTa);
                iSiuThiService.save(sieuThi);
                response.sendRedirect("/thucPham");
        }
    }
}
