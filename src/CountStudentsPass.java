import java.util.Scanner;

public class CountStudentsPass {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int size;
        //Nhap vao so luong sinh vien
        do {
            System.out.print("Nhap vao so luong sinh vien:");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("khong duoc nhap qua 30 sinh vien!");
        } while (size > 30);

        //Nhap vao gia tri cac phan tu cua mang
        array = new int[size];
        int i = 0;
        int rule;
        while (i < array.length) {
            System.out.print("\tDiem cua sinh vien so " + (i + 1) + " : ");
            rule = sc.nextInt();
            if (rule >= 0 && rule <= 10) {
                array[i] = rule;
                i++;
            } else {
                System.out.println("Diem cua sinh vien co gia tri tu 0 den 10!");
            }
        }

        //Dem so luong sinh vien da thi do
        int count = 0;
        for (int j=0;j<array.length;j++) {
            if (array[j] >= 5) {
                count++;
            }
        }

        //Hien thi
        System.out.println("So sinh vien do ky thi la: " + count + " sinh vien.");
    }
}
