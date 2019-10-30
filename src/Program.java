import java.io.*;
import java.util.*;
public class Program {
	public static void main(String[] argv) {
		System.out.println("Please input your file path!");
		Scanner myScanner = new Scanner(System.in);
		String filePath = myScanner.nextLine();
		try {
			ProductArray testArray = ProductArray.read(filePath);
			Program myProgram = new Program();
			boolean status = true;
			while(status) {
				System.out.println("Please make your choice");
				System.out.println("1 - Show the entire Apple catalogue");
				System.out.println("2 - Add a new iPhone");
				System.out.println("3 - Add a new iPad");
				System.out.println("4 - Show the entrie catalogue sorted by product");
				System.out.println("5 - Show the entire Apple catalogue sorted by price (low -> high)");
				System.out.println("6 - Write to the file");
				System.out.println("7 - Stop the program");
				String inputString = myScanner.nextLine();
				switch(inputString) {
					case "1":
						System.out.println(testArray.printFormat());
						break;
					case "2":
						try {
							myProgram.addIPhone(testArray, myScanner);
							break;
						} catch (Exception e) {
							System.out.println("Wrong type ,please check your input");
							
							break;
						}
					case "3":
						try {
							myProgram.addIPad(testArray, myScanner);
							break;
						} catch (Exception e) {
							System.out.println("Wrong type ,please check your input");
							break;
						}
					case "4":
							new Sorter(new TypeSorter(), testArray).start();
							break;
					case "5":
							new Sorter(new PriceSorter(), testArray).start();
							break;
					case "6":
							try {
								testArray.write(filePath);
								break;
							} catch (IOException e) {
								System.out.println("Writing fails, check your documentation authoration!");
								break;
							}
					
					case "7":
							status = false;
							System.out.println("We are terminating now, thank you for using our System");
							break;
					default:
							System.out.println("Unknown instruction, please check your input");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("System can not find the file, please check your input");
		}
	}
	
	
	public void addIPhone(ProductArray testList, Scanner myScanner) throws Exception {
		System.out.println("Please enter the phone model");
		String model = myScanner.nextLine().toUpperCase();
		System.out.println("Please enter the phone screen size");
		String screensize = myScanner.nextLine();
		System.out.println("Please enther the phone processer model");
		String processer = myScanner.nextLine();
		System.out.println("Please enter the phone Modem");
		String modem = myScanner.nextLine();
		System.out.println("Please enter the phone color");
		String color = myScanner.nextLine();
		System.out.println("please enter the phone memory size");
		String memory = myScanner.nextLine();
		System.out.println("please enter the phone supply 3D Touch or not(TRUE or FALSE)");
		boolean ThreeDTouch = Boolean.parseBoolean(myScanner.nextLine());
		System.out.println("please enter the price of the phone");
		int price = Integer.parseInt(myScanner.nextLine());
		IPhone result = new IPhone(model, screensize, processer, color, price, memory, modem, ThreeDTouch);
		testList.addProduct(result);
	}
	
	public void addIPad(ProductArray testList, Scanner myScanner) throws Exception {
		System.out.println("Please enter the Pad model");
		String model = myScanner.nextLine();
		System.out.println("Please enter the Pad screen size");
		String screensize = myScanner.nextLine();
		System.out.println("Please enther the Pad processer model");
		String processer = myScanner.nextLine();
		System.out.println("Please enter the phone internet supplies 4G or not ");
		boolean modem = Boolean.parseBoolean(myScanner.nextLine());
		System.out.println("Please enter the phone color");
		String color = myScanner.nextLine();
		System.out.println("please enter the phone memory size");
		String memory = myScanner.nextLine();
		System.out.println("please enter the price of the phone");
		int price = Integer.parseInt(myScanner.nextLine());
		IPad result = new IPad(model, screensize, processer, color, price, memory, modem);
		testList.addProduct(result);
	}
}
