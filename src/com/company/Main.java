package com.company;
import com.company.model.Savdo;
import com.company.model.User;
import com.company.model.Maxsulot;

import com.company.service.MaxsulotService;
import com.company.service.UserServise;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Savdo savdo = new Savdo();
        ArrayList<User> user = new ArrayList<User>();
        ArrayList<Maxsulot> maxsulot = new ArrayList<Maxsulot>();

        UserServise userServise = new UserServise();
        userServise.addUser("woxi", "olimov", "tungci");
        userServise.addUser("umid", "azamatov", "muzikant");
        userServise.addUser("nurik", "saliyev", "fotogrof");

        MaxsulotService maxsulotService = new MaxsulotService();
        maxsulotService.addMaxsulot("Coca_cola", "Ichimliklar", 2023.10F, 11000.0F, 40);
        maxsulotService.addMaxsulot("Fanta", "Ichimliklar", 2023.10F, 8000.0F, 30);
        maxsulotService.addMaxsulot("Snigers", "Shirinliklar", 2025.12F, 7000.0F, 100);





        boolean menuLoop = true;
        while (menuLoop) {

            System.out.println("=========================================================================");
            System.out.println(" 1. Client ");
            System.out.println("=========================================================================");
            System.out.println(" 2. Users ");
            System.out.println("=========================================================================");
            System.out.println(" 3. Products ");
            System.out.println("=========================================================================");
            Scanner input = new Scanner(System.in);
            System.out.printf("Enter : ");
            int menu;
            menu = input.nextInt();

            switch (menu) {

                case 1:
                    boolean tanlang = true;
                    while (tanlang) {

                        boolean salerN = true;
                        while (salerN) {
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println(" SALERS ");
                            userServise.showIdAndName();
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.print("Select the Saler : ");
                            int selectUserId = input.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (userServise.getUserById(selectUserId) != null) {
                                savdo.setSalerName(userServise.getUserById(selectUserId).getName() +
                                        " " + userServise.getUserById(selectUserId).getSurname());
                            }
                            System.out.println("Want the SalerName to Editing ? ");
                            System.out.println(" 1)Yes  2) Product selection ");
                            System.out.print("Enter : ");
                            int userNY = input.nextInt();
                            if (userNY == 1) {
                                salerN = true;
                            } else {
                                break;
                            }
                        }

                        boolean productN = true;
                        while (productN) {
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println(" PRODUCTS ");
                            maxsulotService.showFull();
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.print("Select the Product ID : ");
                            int selectMaxsulotId = input.nextInt();
                            System.out.print("Enter the product quantity : ");
                            savdo.setMiqdori(input.nextInt());
                            System.out.println("-------------------------------------------------------------------------");
                            if (maxsulotService.getMaxsulotById(selectMaxsulotId) != null) {
                                savdo.setProduktName(maxsulotService.getMaxsulotById(selectMaxsulotId).getName());
                                savdo.setPrice(maxsulotService.getMaxsulotById(selectMaxsulotId).getPrice());
                                maxsulotService.getMaxsulotById(selectMaxsulotId).setCaunt((int)
                                        (maxsulotService.getMaxsulotById(selectMaxsulotId).getCaunt() - savdo.getMiqdori()));
                            }
                            System.out.println("Want the ProductName to Editing ? ");
                            System.out.println(" 1) Yes   2) Enter a name ");
                            System.out.print("Enter : ");
                            int userNY = input.nextInt();
                            if (userNY == 1) {
                                productN = true;
                            } else {
                                break;
                            }
                        }
                        boolean clientN = true;
                        while (clientN) {
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.print("Enter the client name : ");
                            savdo.setClentName(input.next());
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("Want the ClientName to Editing ? ");
                            System.out.println(" 1) Yes   2) Receive a check ");
                            System.out.print("Enter : ");
                            int userNY = input.nextInt();
                            if (userNY == 1) {
                                clientN = true;
                            } else {
                                break;
                            }
                        }

                        System.out.println("-------------------------------------------------------------------------");
                        savdo.showwww();
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("What do you want to do ? ");
                        System.out.println(" 1) Shopping   2) Home ");
                        System.out.print("Enter : ");
                        int userNY = input.nextInt();
                        if (userNY == 1) {
                            tanlang = true;
                        } else {
                            tanlang = false;
                            menuLoop = true;
                        }
                    }
                    break;

                case 2:
                    boolean usertanlang = true;
                    while (usertanlang) {
                        int UserAll;
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.print(" 1. Add Users ");
                        System.out.print(" 2. Update Users ");
                        System.out.print(" 3. Show Users ");
                        System.out.print(" 4. Delete Users ");
                        System.out.println(" 5. Menu ");
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.printf("Enter : ");
                        UserAll = input.nextInt();
                        boolean takrorlash = true;
                        switch (UserAll) {

                            case 1:
                                while (takrorlash) {
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t User addition process ");
                                    userServise.showuser();
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.print(" Create Name : ");
                                    String name = input.next();
                                    System.out.print(" Create Surname : ");
                                    String surname = input.next();
                                    System.out.print(" Create Position : ");
                                    String position = input.next();
                                    userServise.addUser(name, surname, position);
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t Add user completed ");
                                    userServise.showuser();
                                    System.out.println("-------------------------------------------------------------------------");
                                    takrorlash = strartStop();
                                }
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println(" Want the User to Edit ? ");
                                System.out.println(" 1) Yes   2) No ");
                                System.out.printf("Enter : ");
                                int userYN = input.nextInt();
                                if (userYN == 1) {
                                    System.out.println("=========================================================================");
                                    System.out.println(" 1.All update User data ");
                                    System.out.println(" 2.Update User Name : ");
                                    System.out.println(" 3.Update User Surname : ");
                                    System.out.println(" 4.Update User Position : ");
                                    System.out.println(" 5.Update User Status : ");
                                    System.out.println("=========================================================================");
                                    System.out.print(" Enter : ");
                                    int menuUpdUSer = input.nextInt();

                                    switch (menuUpdUSer) {
                                        case 1:
                                            while (takrorlash) {
                                                for (int i = 0; i < user.size(); i++) {
                                                    if (user.get(i).setStatus(" Online ")) {
                                                        userServise.showuser();
                                                    }
                                                }
                                                System.out.println("\t\t\t\t\t Update addition process ");
                                                System.out.println("-------------------------------------------------------------------------");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print(" Update User Id : ");
                                                int id = input.nextInt();
                                                System.out.print(" Update Name : ");
                                                String name = input.next();
                                                System.out.print(" Update Surname : ");
                                                String surname = input.next();
                                                System.out.print(" Update Position : ");
                                                String position = input.next();
                                                System.out.print(" Update User Status ");
                                                System.out.print(" 1) Online   2) Ofline ");
                                                System.out.print(" Enter : ");
                                                int status = input.nextInt();
                                                userServise.updateUser(id, name, surname, position, status);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t Update process completed ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlash = strartStop();
                                            }
                                            break;
                                        case 2:
                                            while (takrorlash) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserName addition process ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print(" Update User Id : ");
                                                int id = input.nextInt();
                                                System.out.print(" Update User Name : ");
                                                String name = input.next();
                                                userServise.updateUserName(id, name);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserName process completed ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlash = strartStop();
                                            }
                                            break;
                                        case 3:
                                            while (takrorlash) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserSurname addition process ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print(" Update User Id : ");
                                                int id = input.nextInt();
                                                System.out.print(" Update User Surname : ");
                                                String surname = input.next();
                                                userServise.updateUserSurname(id, surname);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserSurname process completed ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlash = strartStop();
                                            }
                                            break;
                                        case 4:
                                            while (takrorlash) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserPosition addition process ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print(" Update User Id : ");
                                                int id = input.nextInt();
                                                System.out.print(" Update User Position : ");
                                                String position = input.next();
                                                userServise.updateUserPosition(id, position);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserPosition process completed ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlash = strartStop();
                                            }
                                            break;
                                        case 5:
                                            while (takrorlash) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserStatus addition process ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print(" Update User Id : ");
                                                int id = input.nextInt();
                                                System.out.print(" Update User Status ");
                                                System.out.print(" 1) Online   2) Ofline   Enter : ");
                                                int status = input.nextInt();
                                                userServise.updateUserStatus(id, status);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateUserStatus process completed ");
                                                userServise.showuser();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlash = strartStop();
                                            }
                                            break;
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("\t\t\t\t\t Show result process ");
                                userServise.showUserON();
                                break;

                            case 4:
                                while (takrorlash) {
                                        System.out.println("-------------------------------------------------------------------------");
                                        System.out.println("\t\t\t\t\t User deletion process ");
                                        userServise.showuser();
                                        System.out.println("-------------------------------------------------------------------------");
                                        System.out.print(" Deleted User Id : ");
                                        int id = input.nextInt();
                                        userServise.DeleteUser(id);
                                        System.out.println("-------------------------------------------------------------------------");
                                        System.out.println("\t\t\t\t\t User deletion process complete ");
                                        userServise.showuser();
                                        System.out.println("-------------------------------------------------------------------------");
                                        takrorlash = strartStop();
                                }
                                break;

                            case 5:
                                usertanlang = false;
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean maxsulottanlang = true;
                    while (maxsulottanlang) {
                        int MaxsulotAll;
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.print(" 1. Add Products ");
                        System.out.print(" 2. Update Products ");
                        System.out.print(" 3. Show Products ");
                        System.out.print(" 4. Delete Products ");
                        System.out.println(" 5. Menu ");
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.printf("Enter : ");
                        MaxsulotAll = input.nextInt();
                        boolean takrorlashM = true;

                        switch (MaxsulotAll) {
                            case 1:
                                while (takrorlashM) {
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t Products addition process ");
                                    maxsulotService.showmaxsulot();
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.print(" Create Product Name : ");
                                    String name = input.next();
                                    System.out.print(" Create Position : ");
                                    String position = input.next();
                                    System.out.printf(" Create Date : ");
                                    Float date = input.nextFloat();
                                    System.out.printf(" Create Ptice : ");
                                    Float price = input.nextFloat();
                                    System.out.printf(" Create Caunt : ");
                                    Integer caunt = input.nextInt();
                                    maxsulotService.addMaxsulot(name, position, date, price, caunt);

                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t Products process complete ");
                                    maxsulotService.showmaxsulot();
                                    System.out.println("-------------------------------------------------------------------------");
                                    takrorlashM = strartStop();
                                }
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println(" Want the Product to Edit ? ");
                                System.out.println(" 1) Yes   2) No ");
                                System.out.printf("Enter : ");
                                int maxsulotYN = input.nextInt();
                                if (maxsulotYN == 1) {
                                    System.out.println("=========================================================================");
                                    System.out.println(" 1. All update Product data ");
                                    System.out.println(" 2. Update Product Name ");
                                    System.out.println(" 3. Update Product Position ");
                                    System.out.println(" 4. Update Product Date ");
                                    System.out.println(" 5. Update Product Price ");
                                    System.out.println(" 6. Update Product Caunt ");
                                    System.out.println(" 7. Update Product Status ");
                                    System.out.println("=========================================================================");
                                    System.out.print(" Enter : ");
                                    int menuUpdMaxsulot = input.nextInt();

                                    switch (menuUpdMaxsulot) {
                                        case 1:
                                            while (takrorlashM) {
                                                for (int i = 0; i < maxsulot.size(); i++) {
                                                    if (maxsulot.get(i).setStatus(" Bor ")) {
                                                        maxsulotService.showmaxsulot();
                                                    }
                                                }
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t Update addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print(" Update Product Id : ");
                                                int id = input.nextInt();
                                                System.out.print(" Update Name : ");
                                                String name = input.next();
                                                System.out.print(" Update Position : ");
                                                String position = input.next();
                                                System.out.print(" Update Date : ");
                                                Float date = input.nextFloat();
                                                System.out.print(" Update Price : ");
                                                Float price = input.nextFloat();
                                                System.out.print(" Update Caunt : ");
                                                Integer caunt = input.nextInt();
                                                System.out.print(" Update Status ");
                                                System.out.print(" 1) Bor   2) Yoq ");
                                                System.out.print(" Enter : ");
                                                int status = input.nextInt();
                                                maxsulotService.updateMaxsulot(id, name, position, date, price, caunt, status);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t Update process complete");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                        case 2:
                                            while (takrorlashM) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductName addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print("update Product id: ");
                                                int id = input.nextInt();
                                                System.out.print("update Product Name: ");
                                                String name = input.next();
                                                maxsulotService.maxsulotUpdateName(id, name);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductName process complete ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                        case 3:
                                            while (takrorlashM) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductPosition addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print("update product id: ");
                                                int id = input.nextInt();
                                                System.out.print("update product Position: ");
                                                String position = input.next();
                                                maxsulotService.maxsulotUpdatePosition(id, position);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductPosition process complete ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                        case 4:
                                            while (takrorlashM) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductDate addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print("update product id: ");
                                                int id = input.nextInt();
                                                System.out.print("update product date: ");
                                                Float Date = input.nextFloat();
                                                maxsulotService.maxsulotUpdateDate(id, Date);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductDate process complete ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                        case 5:
                                            while (takrorlashM) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductPrice addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print("update product id: ");
                                                int id = input.nextInt();
                                                System.out.print("update product price: ");
                                                Float price = input.nextFloat();
                                                maxsulotService.maxsulotUpdatePrice(id, price);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductPrice process complete ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                        case 6:
                                            while (takrorlashM) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductCaunt addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print("update product id: ");
                                                int id = input.nextInt();
                                                System.out.print("update product caunt: ");
                                                int caunt = input.nextInt();
                                                maxsulotService.maxsulotUpdateCaunt(id, caunt);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductCaunt process complete ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                        case 7:
                                            while (takrorlashM) {
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductStatus addition process ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.print("update product id: ");
                                                int id = input.nextInt();
                                                System.out.print("update product Status: ");
                                                System.out.print("1)Bor 2)Yoq:");
                                                int status = input.nextInt();
                                                maxsulotService.maxsulotUpdateStatus(id, status);
                                                System.out.println("-------------------------------------------------------------------------");
                                                System.out.println("\t\t\t\t\t UpdateProductStatus process complete ");
                                                maxsulotService.showmaxsulot();
                                                System.out.println("-------------------------------------------------------------------------");
                                                takrorlashM = strartStop();
                                            }
                                            break;
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("\t\t\t\t\t Show result process ");
                                maxsulotService.showmaxsulot();
                                break;

                            case 4:
                                while (takrorlashM) {
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t Product deletion process ");
                                    maxsulotService.showmaxsulot();
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.print(" Deleted Product Id : ");
                                    int id = input.nextInt();
                                    maxsulotService.DeleteMaxsulot(id);
                                    System.out.println("-------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t Product deletion process complete ");
                                    maxsulotService.showmaxsulot();
                                    System.out.println("-------------------------------------------------------------------------");
                                    takrorlashM = strartStop();
                                }
                                break;

                            case 5:
                                maxsulottanlang = false;
                                break;
                        }
                    }
                    break;
            }
        }

    }



    private static boolean strartStop() {
        Scanner input = new Scanner(System.in);
        int tekshirish;
        System.out.println("0-> Back to home");
        System.out.println("1-> Next");
        tekshirish = input.nextInt();
        if (tekshirish == 0) {
            return false;
        }return true;
    }
    private static boolean tanlang() {
        Scanner input = new Scanner(System.in);
        int tekshirish;
        System.out.println("0-> Back to Menu");
        System.out.println("1-> Next");
        tekshirish = input.nextInt();
        if (tekshirish == 0) {
            return false;
        }return true;
    }

}











