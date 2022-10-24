package backend_d7;

import java.util.Scanner;

public class Mainday7 {

	public static void main(String[] args) {
		System.out.println("----All borrow books list----");
		showBorrowListAll();

		System.out.println("----Show book borrow and return status----");
		Scanner scanner = new Scanner(System.in);
		int count = showAllBooks();
		int choose = 0;
		boolean legit = false;
		do {
			try {
				legit = false;
				System.out.print("Choose a book title: ");
				choose = scanner.nextInt();
				legit = !(choose < 1 || choose > count);
			} catch (Exception e) {
				legit = false;
			}
		} while (!legit);

		showBookBorrowStatus(choose);
	}

	public static int showAllBooks() {
		int count = 0;
		for (BookTitle book : BookDataSource.books) {
			System.out.println(book.getISBN() + ". " + book.getName());
			count++;
		}
		return count;
	}

	public static void showBookBorrowStatus(int isbn) {
		for (BorrowDetail brd : BorrowDetailDataSource.borrowDetails) {
			if (brd.getISBN() == isbn) {
				showBorrowAndReturnStatusGeneral(brd.getBorrowID(), isbn);
				System.out.println("Quantity: " + brd.getQuantity());
			}
		}

	}

	public static void showBorrowAndReturnStatusGeneral(int id, int isbn) {
		for (Borrow br : BorrowDataSource.borrows) {
			if (br.getID() == id) {
				System.out.print("\nCustomer: ");
				printNameCustomer(br.getCusID());
				System.out.println("\nDate borrow: " + br.getTimeBorrow());
				showReturnDate(id, isbn);
				return;
			}
		}
	}

	public static void showReturnDate(int idBorrow, int isbn) {
		for (ReturnDetail rd : ReturnDetailDataSource.returnDetails) {
			if (rd.getBorrowID() == idBorrow && rd.getISBN() == isbn) {
				System.out.println("Date return: " + rd.getTimeReturn());
				return;
			}
		}
		System.out.println("Date return: not return yet");
	}

	public static void showBorrowListAll() {
		for (Borrow br : BorrowDataSource.borrows) {
			showBorrowListID(br.getID());
			System.out.println();
		}
	}

	public static void showBorrowListID(int id) {
		for (Borrow br : BorrowDataSource.borrows) {
			if (br.getID() == id) {

				System.out.println("Borrow ID: " + id);
				System.out.print("Customer: ");
				printNameCustomer(br.getCusID());
				System.out.print("\nLocation: ");
				printNameLocation(br.getLocationID());
				System.out.println();
				System.out.println("Total: " + br.getTotalBook());
				break;
			}
		}
		for (BorrowDetail brd : BorrowDetailDataSource.borrowDetails) {
			if (brd.getBorrowID() == id) {
				printNameBook(brd.getISBN());
				System.out.println(", quantity: " + brd.getQuantity());
			}
		}
	}

	public static void printNameCustomer(int id) {
		for (Customer c : CustomerDataSource.cus) {
			if (c.getId() == id) {
				System.out.print(c.getName());
			}
		}
	}

	public static void printNameLocation(int id) {
		for (Location l : LocationDataSource.locations) {
			if (l.getID() == id) {
				System.out.print(l.getName());
				break;
			}
		}
	}

	public static void printNameBook(int isbn) {
		for (BookTitle b : BookDataSource.books) {
			if (b.getISBN() == isbn) {
				System.out.print(b.getName());
				break;
			}
		}
	}
}
