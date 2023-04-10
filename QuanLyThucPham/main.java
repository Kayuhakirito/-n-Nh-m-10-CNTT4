package QuanLyThucPham;


import.java.util  

import.java.util.arraylist  

import.java.util.collections
 
package menu;


	public class main { 

		public static void main(string[] args) { 

			ArrayList<string> danhsachthucpham= new Arraylist<string>(); 

			int n;  

			int luachon; 

			int[] array;  

			Scanner sc =new Scanner (system.in); 

			system.out.println("1.Nhập vào số lượng thực phẩm ."); 

			system.out.println("2.Sắp xếp sản phẩm giảm dần theo giá thực phẩm "); 

			system.out.println("3. Thoát chương trình"); 

			 

			do{ 

				System.out.println("nhập lựa chọn của bạn:"); 

				luachon= Integer.parseInt(sc.nextLine());  

				switch(luachon){ 

case 1:{ 

	system.out.print("Nhập vào số lượng thực  phẩm :"); 

	n=integer.parseint(sc.nextLine()); 

	Array =new int [n]; // lưu n vào array 

	for(int i =0;i<Array.length;i++){ 

			ThucPham TP =new ThucPham(); 

		               TP.Nhap Thong Tin Thuc Pham (); 

			danhsachTP.add(TP);								 

break; 

} 

case 2:{ 

	collections.sort(danhsachthucpham,(ThucPham TP1,ThucPham TP2)){ 

													if(TP1.getGia()<TP1.getGia()) 									{ 

	return 1; 

	} 

	else{ 

	if(TP1.getGia()==TP2.getGia()) 

	{ 

	return 0; 

	else{ 

	return -1; 

                } 

	} 

	}); 

	system.out.println("----- Danh Sách Sau Khi Giảm Dần Theo Giá----"); 

	system.out.printf("\n%-20s %-10s,"Tên Thực Phẩm","Giá"); 

	for(int i=0;i<danhsachTP.size();i++){ 

	danhsachTP.get(i).HienThiSanPham(); 

	} 

							 

			break; 

			case 3:{ 

			break; 

				 

		}while(luachon!=3); 

	} 