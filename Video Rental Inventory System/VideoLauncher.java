import java.util.*;

class Video {
	String videoName;
	boolean checkout;
	int rating;

	Video(String name) {
		this.videoName = name;
	}

	String getName() {
		return videoName;
	}

	void doCheckout() {
		this.checkout = true;
	}

	void doReturn() {
		this.checkout = false;
	}

	void receiveRating(int rating) {
		this.rating = rating;
	}

	int getRating() {
		return rating;
	}

	boolean getCheckout() {
		return checkout;
	}
}

class VideoStore {
	Video[] store = new Video[100];
	int i = 0;

	void addVideo(String name) {
		store[i++] = new Video(name);
		System.out.println("Video \""+name+" added Successfully...");
	}

	void doCheckout(String name) {
		for(int j = 0; j < i; j++) {
			if(store[j].getName().equalsIgnoreCase(name)) {
				store[j].doCheckout();
				System.out.println("Video "+name+" checked out successfully.");
				return;
			}
		}
		System.out.println("Video Not Found");
	}

	void doReturn(String name) {
		for (int j = 0; j < i; j++) {
			if (store[j].getName().equalsIgnoreCase(name)) {
				store[j].doReturn();
				System.out.println("Video " + name + " returned successfully.");
				return;
			}
		}
		System.out.println("Video Not Found");
	}

	void receiveRating(String name, int rating) {
		for (int j = 0; j < i; j++) {
			if (store[j].getName().equalsIgnoreCase(name)) {
				store[j].receiveRating(rating);
				System.out.println("Rating \""+9+"\" has been mapped to the Video \""+name+"\""); 
				return;
			}
		}
		System.out.println("Video Not Found");
	}

	void listInventory() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
		System.out.println("--------------------------------------------------------");
		for (int j = 0; j < i; j++) {
			System.out.println(store[j].getName()+"\t|\t"+store[j].getCheckout()+"\t|\t"+store[j].rating);
			System.out.println("--------------------------------------------------------");
		}
	}

}

class VideoLauncher {

	public static void main(String[] args) {
		VideoStore store = new VideoStore();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos:\r\n" + //
					"2. Check Out Video :\r\n" + //
					"3. Return Video :\r\n" + //
					"4. Receive Rating :\r\n" + //
					"5. List Inventory :\r\n" + //
					"6. Exit : ");
			System.out.println("Enter your choice (1..6): ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:
					System.out.println("Enter the name of the video you want to add: ");
					String nameToAdd = sc.nextLine();
					store.addVideo(nameToAdd);
					break;
					case 2:
					System.out.println("Enter the name of the video you want to check out: ");
					String nameToCheckout = sc.nextLine();
					store.doCheckout(nameToCheckout);
					break;
				case 3:
					System.out.println("Enter the name of the video you want to Return: ");
					String nameToReturn = sc.nextLine();
					store.doReturn(nameToReturn);
					break;
				case 4:
					System.out.println("Enter the name of the video you want to Rate: ");
					String nameToRate = sc.next();
					System.out.println("Enter the rating for this video: ");
					int rating = sc.nextInt();
					sc.nextLine();
					store.receiveRating(nameToRate, rating);
					break;
				case 5:
					store.listInventory();
					break;
				case 6:
					System.out.println("Exiting...!! Thanks for using the application.");
					System.exit(0);
					break;
				default:
					System.out.println("please enter valid choice...");
			}
		}
	}
}