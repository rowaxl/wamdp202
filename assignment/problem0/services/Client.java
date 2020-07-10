package services;

public class Client
		implements ServiceProtocolInterface, CleaningServiceProtocolInterface, CarReipairServiceProtocolInterface,
		HomeServicesInterface, StudentServiceInterface
	{

	private String name;
	private String address;
	private String contactNo;
	private PaintingProvider paintingProvider;
	private CleaningProvider cleaningProvider;
	private CarRepairServiceProvider carRepairProvider;
	private HomeServiceProvider homeServiceProvider;
	private StudentServiceProvider studentServiceProvider;
	
	public Client(String name, String address, String contactNo) {
		super();
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setPaintingProvider(PaintingProvider paintingP) {
		this.paintingProvider = paintingP;
		this.paintingProvider.delegate = this;
	}
	
	public void setCleaniningProvider(CleaningProvider cleaningP) {
		this.cleaningProvider = cleaningP;
		this.cleaningProvider.delegate = this;
	}

	public void setCarRepairProvider(CarRepairServiceProvider carRepairP) {
		this.carRepairProvider = carRepairP;
		this.carRepairProvider.delegate = this;
	}

	public void setHomeServiceProvider(HomeServiceProvider homeServiceProvider) {
		this.homeServiceProvider = homeServiceProvider;
		this.homeServiceProvider.delegate = this;
	}

	public void setStudentServiceProvider(StudentServiceProvider studentServiceProvider) {
		this.studentServiceProvider = studentServiceProvider;
		this.studentServiceProvider.delegate = this;
	}
	//=======================
//	@Override
//	public String jobDescription() {
//		// TODO Auto-generated method stub
//		return "This is a painting job of my bedroom";
//	}
//
//	@Override
//	public String address() {
//		// TODO Auto-generated method stub
//		return "Vancouver";
//	}
//
//	@Override
//	public String paintColor() {
//		// TODO Auto-generated method stub
//		return "Pink";
//	}
//
//	@Override
//	public int size() {
//		// TODO Auto-generated method stub
//		return 1000;
//	}
//
//	@Override
//	public String startDate() {
//		// TODO Auto-generated method stub
//		return "May 2019";
//	}
//
//	@Override
//	public String expectedEndDate() {
//		// TODO Auto-generated method stub
//		return "June 2019";
//	}

	@Override
	public PaintingService paintingService() {
		// TODO Auto-generated method stub
		String description = "Paint my bedroom";
		String startDate = "May 2019";
		String expectedEndDate = "June 2019";
		String painingColor = "Pink";
		int size = 1000;
		String address = "Hastings";
		
		PaintingService ps = new PaintingService(description, startDate, expectedEndDate, painingColor, size, address);
		return ps;
	}

	@Override
	public CleaningService cleaningService() {
		// TODO Auto-generated method stub
		CleaningService cleaningService = new CleaningService("Cleaning Service");
		return cleaningService;
	}

	@Override
	public CarRepairService carRepairService() {
		CarRepairService repairService = new CarRepairService("Bumped in front left door", "LaFerrari");
		return repairService;
	}

	@Override
	public CookingService cookingService() {
		CookingService cooking = new CookingService("Cook the meal for the family", "LoCab", 4);
		return cooking;
	}

	@Override
	public WashingService washingService() {
		WashingService washing = new WashingService("Wash the shirts carefully", "White", 10);
		return washing;
	}

	@Override
	public BabysittingService babysittingService() {
		BabysittingService babysitting = new BabysittingService("Care my son", "Nuts", 4);
		return babysitting;
	}

	@Override
	public StudentService studentService() {
		StudentService studentService = new StudentService("Semester GPA", "GPA_2020.pdf");
		return studentService;
	}
}
