package giai_thuat.giaiThuat1.mvc2.Controller;

import giai_thuat.giaiThuat1.mvc2.Service.ConChimServiceImpl;
import giai_thuat.giaiThuat1.mvc2.Service.IConChimService;

import java.util.Scanner;

public class ConChimController {
    IConChimService iConChimService = new ConChimServiceImpl();
    public void danhSachConChim(){
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            try {

            choose = Integer.parseInt(scanner.nextLine());
            System.out.println("-- Con Chim --"+
                    "1. Hien thi\n"+
                    "2. Thoat");
            switch (choose){
                case 1:
                    iConChimService.display();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
            }catch (NumberFormatException e){
                System.out.println("Moi nhap lai!");
            }
        }while (true);
    }
}
