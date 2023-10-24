import java.util.Scanner;

public class ATMbank {
    public static void main(String[] args) {
        int so_du = 1000000000;
        int tien_gui, tien_rut,tien_tietkiem;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATMbank kính chào quý khách!");
            System.out.println("Chọn 1 để rút tiền");
            System.out.println("Chọn 2 để gửi tiền");
            System.out.println("Chọn 3 để kiểm tra số dư");
            System.out.println("Chọn 4 để gửi tiền tiết kiệm");
            System.out.print("Hãy chọn thao tác mà bạn muốn thực hiện:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Nhập số tiền:");

                    tien_rut = sc.nextInt();

                    if(so_du >= tien_rut)
                    {
                        so_du = so_du - tien_rut;
                        System.out.println("Hãy nhận tiền từ ATM! Cảm ơn bạn đã sử dụng ATMbank!");
                    }
                    else
                    {
                        System.out.println("Số dư không đủ, vui lòng nạp tiền để có thể thực hiện dịch vụ.");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Nhập số tiền:");

                    tien_gui = sc.nextInt();

                    so_du = so_du + tien_gui;

                    System.out.println("Bạn đã gửi tiền thành công! Cảm ơn bạn đã sử dụng Freetuts ATM!");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Số dư hiện tại của bạn : "+so_du + "VNĐ");
                    System.out.println("Cảm ơn bạn đã sử dụng ATMbank !");
                    break;

                case 4:
                    System.out.print("Nhập số tiền:");

                    tien_tietkiem = sc.nextInt();

                    if(so_du >= tien_tietkiem)
                    {
                        so_du = so_du - tien_tietkiem;
                        System.out.println("Bạn đã gởi tiền tiết kiệm thành công! Cảm ơn bạn đã sử dụng ATMbank!");
                    }
                    else
                    {
                        System.out.println("Số dư không đủ, vui lòng nạp tiền để có thể thực hiện dịch vụ.");
                    }
                    System.out.println("");
                    break;
            }
        }
    }
}
