import.java.until  

import.java.util.arraylisst  
package QuanLiSanPham; 



public class ThucPham{ 

	private string tenTP; 

	private double gia; 

   

	public ThucPham(String tenTP,double gia){ 

		this.tenTP= tenTP; 

		this.gia=gia; 

	} 

	 

	public string getTenTP(){ 

		return tenTP; 

	} 

  

	public void setTenTP(string tenTP){ 

		this.tenTP=tenTP 

	} 

  

	public double getgia(){ 

		return gia; 

	} 

  

	public void setGia(double gia){ 

		this.gia=gia; 

	} 

  

	public void Nhap Thong Tin Thuc Pham (){ 

		Scanner sc= new Scanner(system.in); 

		system.out.print("Tên Thực Phẩm : "); 

		tenTP=sc.nextLine(); 

		system.out.print("giá : "); 

		gia = Double.parseDouble(sc.nextLine());   

	} 

  

  

	public void HienThiSanPham(){ 

		system.out.printf("\n%-20s %-10.3f",tenTP,gia);  

	} 