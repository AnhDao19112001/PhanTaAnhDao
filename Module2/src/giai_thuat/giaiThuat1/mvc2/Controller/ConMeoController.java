package giai_thuat.giaiThuat1.mvc2.Controller;

import giai_thuat.giaiThuat1.mvc2.Service.ConMeoServiceImpl;
import giai_thuat.giaiThuat1.mvc2.Service.IConMeoService;

import java.util.Scanner;

public class ConMeoController {
    IConMeoService iConMeoService = new ConMeoServiceImpl();
    public void danhSachMeo(){
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        do {
            try {

                System.out.println("--Con meo--"+
                        "1. Hien thi con meo\n"+
                        "2. Thoat");
                choise = Integer.parseInt(scanner.nextLine());
                switch (choise) {
                    case 1:
                        iConMeoService.display();
                        break;
                    case 2:
                        System.exit(0);
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Vui long nhap lai!");
            }
        }while (true);
    }
}
