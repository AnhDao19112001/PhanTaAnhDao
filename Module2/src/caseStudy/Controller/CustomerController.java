//package caseStudy.Controller;
//
//import caseStudy.Services.ICustomerService;
//import caseStudy.Services.impl.CustomerService;
//
//import java.util.Scanner;
//
//public class CustomerController {
//    public void menuCustomerManagement(){
//        Scanner scanner = new Scanner(System.in);
//        ICustomerService iCustomerService = new CustomerService();
//        do {
//            System.out.println("\nCustomer Management\n"+
//                    "1.Display list customers\n"+
//                    "2.Add new customer\n"+
//                    "3.Edit customer\n"+
//                    "4.Return main menu");
//            int choose = 0;
//            try {
//                System.out.println("Mời bạn nhập lựa chọn: ");
//                choose = Integer.parseInt(scanner.nextLine());
//            }catch (NumberFormatException e){
//                e.getStackTrace();
//            }
//
//        }while (true);
//    }
//}
