package net.codejava;

public class Invoice {

	public static void main(String[] args) {
		System.out.println("**************************Adamson Computers Ltd**********************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City\t*\tTel. No:123-4567");
		System.out.println("\t\t\tVAT REG. TIN 098-765-4321-0000");
		System.out.println("\t\t\t\tSALES INVOICE");
		String soldTo="C026-01-0912/2022";
		String address="Leo Chege Ng'ang'a";
		String date="16/09/2023";
		String contact="0100100100";
		int quantity1=4;
		int quantity2=10;
		int quantity3=9;
		int quantity4=10;
		String item1="Pencil";
		String item2="Duster";
		String item3="Pens";
		String item4="crayon";
		int unit1=20;
		int unit2=50;
		int unit3=30;
		int unit4=80;
		float amount1=80.00f;
		float amount2=500.00f;
		float amount3=270.00f;
		float amount4=800.00f;
		float subTotal=1650.00f;
		float vat=264.00f;
		float total=1914.00f;
		
		
		System.out.print("Sold to:"+soldTo);
		System.out.println("\t\t\tDate:"+date);
		System.out.print("Address:"+address);
		System.out.println("\t\t\tContact Number:"+contact);
		System.out.println("========================================================================");
		System.out.println("Qty\t|\tItem Description\t|\tUnit Price\t|Amount");
		System.out.println("========================================================================");
		System.out.print(+quantity1);
		System.out.print("\t|\t"+item1);
		System.out.print("\t\t\t|\t"+unit1);
		System.out.println("\t\t|"+amount1);
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(+quantity2);
		System.out.print("\t|\t"+item2);
		System.out.print("\t\t\t|\t"+unit2);
		System.out.println("\t\t|"+amount2);
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(+quantity3);
		System.out.print("\t|\t"+item3);
		System.out.print("\t\t\t|\t"+unit3);
		System.out.println("\t\t|"+amount3);
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(+quantity4);
		System.out.print("\t|\t"+item4);
		System.out.print("\t\t\t|\t"+unit4);
		System.out.println("\t\t|"+amount4);
		System.out.println("==========================================================================");
		System.out.println("\t\t\t\t\t\t|Sub total\t|"+subTotal);
		System.out.println("\t\t\t\t\t\t==========================");
		System.out.println("\t\t\t\t\t\t|VAT(16%)\t|"+vat);
		System.out.println("\t\t\t\t\t\t==========================");
		System.out.println("\t\t\t\t\t\t|Total Amount\t|"+total);
		System.out.println("\t\t\t\t\t\t==========================");
		
		
	}

}
