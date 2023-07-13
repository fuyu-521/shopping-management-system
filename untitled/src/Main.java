import java.util.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int numberShop=0;
        int numm=0;
        // 创建管理员
        Admin admin = new Admin("admin", "ynu");
        // 创建客户
        Customer customer = new Customer("user", "ynu");
        Map<Integer, Product> shopItems=new HashMap<>();
        Product[] products = new Product[30];
        int num1=0;
        ShoppingCart shoppingCart1=new ShoppingCart();

        while(true){

            System.out.println("             (∧_∧)\n    \t\t\t 购物管理系统\t\t\t\t\t\t@ 20201060342 王浩洋 \n" +
                "\n\n\t\t(∧_∧)σ    欢迎登入云大购物      σ(∧_∧；)\n\t\t请输入账号：");
            Scanner scanner = new Scanner(System.in);
            String usernames =scanner.nextLine();
            System.out.println("\n\n\t\t(∧_∧)σ              σ(∧_∧；)\n\t\t请输入密码：\n\n\n");
            String passwords = scanner.nextLine();
            if(admin.username.equals(usernames)&&admin.password.equals(passwords)){
                int leave=0;
                while(true){
                    if (leave==1)
                        break;
                    System.out.println("            (∧_∧)\n     请选择要进行的操作：\t\t\t\t\t\t@ 20201060342 王浩洋\n" +
                            "\t\t\t\t   账户操作\n\n\t\t(∧_∧)σ     1.管理员密码修改     σ(∧_∧；)\n\t\t(∧_∧)σ     2.顾客密码修改     σ(∧_∧；)\n\n" +
                            "\t\t******===******===******===******===******===******   \n\t\t\t   Σ(￣□￣)\n\t\t\t商品管理\t\t\t\t\t\t\t      \n" +
                            "\t\t\t3.查看所有商品信息    \t\t\t        \n" +
                            "\t\t\t4.添加商品    \n\t\t\t5.修改商品      \n\t\t\t6.删除商品\n \t\t\t7.退出登录;");
                    Scanner scanner1 = new Scanner(System.in);
                    int input1=scanner1.nextInt();
                    switch (input1){
                        case 1:
                            admin.changePassword();
                            break;
                        case 2:
                            customer.changePassword();
                            break;
                        case 3:
                            System.out.println("            (∧_∧)\n     下方为当前所有商品内容：\t\t\t\t\t\t@ 20201060342 王浩洋\n" +
                                    "\n\t\t商品序号\t\t\t\t商品名称\t\t\t\t商品价格\t\t\t\t商品数量\n\n" +
                                    "\t\t******===******===******===******===******===******===******   \n\n\n");
                            for(int i=1;i<=numberShop;i++)
                            {
                                System.out.println("\t\t\t\t"+shopItems.get(i).productNumber+"\t\t\t\t"+shopItems.get(i).productName
                                +"\t\t\t\t"+shopItems.get(i).purchasePrice+"\t\t\t\t"+shopItems.get(i).quantity);
                            }
                            System.out.println("按下回车继续...");
                            Scanner scanne = new Scanner(System.in);
                            scanne.nextLine();
                            break;
                        case 4:
                            System.out.println("请依次输入商品序号、商品名称、商品价格、商品数量：");
                            Scanner scanner2 = new Scanner(System.in);

                            Scanner scanner3 = new Scanner(System.in);

                            Scanner scanner4 = new Scanner(System.in);

                            Scanner scanner5 = new Scanner(System.in);
                            products[num1]=new Product(scanner2.nextLine(),scanner3.nextLine(),scanner4.nextDouble(),scanner5.nextInt());
                            shopItems.putIfAbsent(numberShop+1,products[num1]);
                            numberShop+=1;
                            num1+=1;
                            numm+=1;
                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne1 = new Scanner(System.in);
                            scanne1.nextLine();
                            break;
                        case 5:
                            System.out.println("请输入商品序号（不需要补零）：");
                            Scanner scann11 = new Scanner(System.in);
                            int changenum=scann11.nextInt();
                            Product productm =shopItems.get(changenum);

                            System.out.println("请选择修改内容（1.商品名称  2.商品价格  3.商品数量）：");
                            Scanner scann1 = new Scanner(System.in);
                            int yourse=scann1.nextInt();
                            switch (yourse){
                                case 1:
                                    System.out.println("输入修改后的名称：");
                                    Scanner scannname = new Scanner(System.in);
                                    productm.productName=scannname.nextLine();
                                    shopItems.put(changenum,productm);
                                    System.out.println("修改成功！");
                                    System.out.println("\n\n");
                                    System.out.println("按下回车继续...");
                                    Scanner scanne2 = new Scanner(System.in);
                                    scanne2.nextLine();
                                    break;
                                case 2:
                                    System.out.println("输入修改后的价格：");
                                    Scanner scannjia = new Scanner(System.in);
                                    productm.purchasePrice=scannjia.nextDouble();
                                    shopItems.put(changenum,productm);
                                    System.out.println("修改成功！");
                                    System.out.println("\n\n");
                                    System.out.println("按下回车继续...");
                                    Scanner scanne3 = new Scanner(System.in);
                                    scanne3.nextLine();
                                    break;
                                case 3:
                                    System.out.println("输入修改后的数量：");
                                    Scanner scannnum = new Scanner(System.in);
                                    productm.quantity=scannnum.nextInt();
                                    shopItems.put(changenum,productm);
                                    System.out.println("修改成功！");
                                    System.out.println("\n\n");
                                    System.out.println("按下回车继续...");
                                    Scanner scanne4 = new Scanner(System.in);
                                    scanne4.nextLine();
                                    break;

                                default:
                                    System.out.println("无效输入!\n\n");
                                    System.out.println("按下回车继续...");
                                    Scanner scanne5 = new Scanner(System.in);
                                    scanne5.nextLine();
                                    break;
                            }
                            break;
                        case 6:
                            System.out.println("输入要删除的商品序号：");
                            Scanner scannnu = new Scanner(System.in);
                            shopItems.remove(scannnu.nextInt());
                            numm-=1;

                            System.out.println("删除成功！");
                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne6 = new Scanner(System.in);
                            scanne6.nextLine();

                            break;

                        case 7:

                            leave=1;
                            break;
                        default:
                            System.out.println("请重新输入！");
                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne5 = new Scanner(System.in);
                            scanne5.nextLine();
                            break;
                    }

                }
            } else if (customer.username.equals(usernames)&&customer.password.equals(passwords)) {
                while (true){
                    System.out.println("            (∧_∧)\n     请选择要进行的操作：\t\t\t\t\t\t@ 20201060342 王浩洋\n" +
                            "\t\t\t\t   账户操作\n\n\t\t(∧_∧)σ     1.用户密码修改     σ(∧_∧；)\n" +
                            "\t\t******===******===******===******===******===******   \n\t\t\t   Σ(￣□￣)\n\t购物管理:\t\t\t\t\t\t\t购物记录:\n\n" +
                            "\t2.查看所有商品信息    \t\t\t6.查看购物记录\n" +
                            "\t3.添加商品于购物车\n\t4.查看购物车   \t\t\t\t\t         \n\t5.结账  \n");
                    Scanner scanner2 = new Scanner(System.in);
                    int input1=scanner2.nextInt();
                    switch (input1){
                        case 1:
                            customer.changePassword();
                            break;
                        case 2:
                            System.out.println("            (∧_∧)\n     下方为当前所有商品内容：\t\t\t\t\t\t@ 20201060342 王浩洋\n" +
                                    "\n\t\t商品序号\t\t\t\t商品名称\t\t\t\t商品价格\t\t\t\t商品数量\n\n" +
                                    "\t\t******===******===******===******===******===******===******   \n\n\n");
                            for(int i=1;i<=numberShop;i++)
                            {
                                System.out.println("\t\t\t\t"+shopItems.get(i).productNumber+"\t\t\t\t"+shopItems.get(i).productName
                                        +"\t\t\t\t"+shopItems.get(i).purchasePrice+"\t\t\t\t"+shopItems.get(i).quantity);
                            }
                            System.out.println("按下回车继续...");
                            Scanner scanne = new Scanner(System.in);
                            scanne.nextLine();
                            break;
                        case 3:
                            System.out.println("请选择加入购物车的商品序号：");
                            Scanner scanner3 = new Scanner(System.in);
                            int mu=scanner3.nextInt();
                            shoppingCart1.cartItems.putIfAbsent(shopItems.get(mu),0);
                            shoppingCart1.cartItems.put(shopItems.get(mu),shoppingCart1.cartItems.get(shopItems.get(mu))+1);
                            System.out.println("添加成功！");


                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne1 = new Scanner(System.in);
                            scanne1.nextLine();
                            break;
                        case 4:
                            System.out.println("购物车清单(商品名称后跟随数量)：");

                            for (Map.Entry<Product, Integer> entry : shoppingCart1.cartItems.entrySet()) {
                                System.out.println( "商品名称："+ entry.getKey().productName + "\t\t购买数量：" + entry.getValue() );
                            }
                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne2 = new Scanner(System.in);
                            scanne2.nextLine();
                            break;

                        case 5:
                            customer.shoppingCart.cartItems.putAll(shoppingCart1.cartItems);
                            Order order = new Order(customer.shoppingCart.cartItems);
                            customer.orderHistory.add(order);
                            shoppingCart1.clear();
//                            for (Order order1 : customer.orderHistory) {
//                                System.out.println("购买日期及时间: " + order1.getPurchaseTime());
//                                System.out.println("购物列表: ");
//                                for (Map.Entry<Product, Integer> entry : order1.productList.entrySet()) {
//                                    System.out.println( entry.getKey().productName + "\t\t购买数量：" + entry.getValue() );
//                                }
//                            }
                            System.out.println("结账成功，订单已进入购物历史！");
                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne7 = new Scanner(System.in);
                            scanne7.nextLine();
                            break;
                        case 6:
                            for (Order order1 : customer.orderHistory) {
                                System.out.println("购买日期及时间: " + order1.getPurchaseTime());
                                System.out.println("购物列表: ");
                                for (Map.Entry<Product, Integer> entry : order1.productList.entrySet()) {
                                    System.out.println( entry.getKey().productName + "\t\t购买数量：" + entry.getValue() );
                                }
                            }
                            System.out.println("按下回车继续...");
                            Scanner scanne8 = new Scanner(System.in);
                            scanne8.nextLine();
                            break;
                        default:
                            System.out.println("请重新输入！");
                            System.out.println("\n\n");
                            System.out.println("按下回车继续...");
                            Scanner scanne5 = new Scanner(System.in);
                            scanne5.nextLine();
                            break;
                    }
                }

            }else {
                System.out.println("\n密码错误,请重新登录！\n");
                System.out.println("按下回车继续...");
                Scanner scanne5 = new Scanner(System.in);
                scanne5.nextLine();
                continue;
            }

        }

    }

}


