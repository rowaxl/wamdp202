import services.*;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client("Ali", "Vancouver", "778");
		PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		client.setPaintingProvider(provider);
		provider.receiveService();
		
		CleaningProvider cProvider = new CleaningProvider();
		client.setCleaniningProvider(cProvider);
		cProvider.receiveService();
		
		// P0-1
		CarRepairServiceProvider carRepairProvider = new CarRepairServiceProvider();
		client.setCarRepairProvider(carRepairProvider);
		carRepairProvider.receiveService();

		// P0-2
		HomeServiceProvider homeServiceProvider = new HomeServiceProvider();
		client.setHomeServiceProvider(homeServiceProvider);
		homeServiceProvider.receiveBabySittingService();
		System.out.println();
		homeServiceProvider.receiveCookingService();
		System.out.println();
		homeServiceProvider.receiveWashingService();
		System.out.println();

		// P0-3
		StudentServiceProvider studentServiceProvider = new StudentServiceProvider();
		client.setStudentServiceProvider(studentServiceProvider);
		studentServiceProvider.receiveStudentService();

//		String description = "Paint my bedroom";
//		String startDate = "May 2019";
//		String expectedEndDate = "June 2019";
//		String painingColor = "Pink";
//		int size = 1000;
//		String address = "Hastings";
//	
//		
//		PaintingService paintingService = new PaintingService(description, 
//				startDate, 
//				expectedEndDate, 
//				painingColor, 
//				size, 
//				address, client);
//		
//		paintingService.setProvider(provider);
//		
	}

}
