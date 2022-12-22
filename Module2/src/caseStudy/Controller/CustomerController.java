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
//            switch (choose){
//                case 1:
//                    iCustomerService.display;
//                    break;
//                case 2:
//                    iCustomerService.add;
//                    break;
//                case 3:
//                    iCustomerService.edit;
//                    break;
//                case 4:
//                    System.exit(0);
//                default:
//                    System.out.println("Vui lòng nhập lại!");
//            }
//        }while (true);
//    }
//}
