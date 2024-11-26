
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    
//    //instance member
//    private int id;
//    //classifier member
//    private static int nbDigitalVideoDiscs=0;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	
	 public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	//tiêu đề
	public DigitalVideoDisc(String title) {
		
		this.title = title;
		
		//khi khoi tao se update nbDigitalVideoDiscs
		this.id=nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	//danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String category, String director, float cost) {
		
		this.category = category;
		this.director = director;
		this.cost = cost;
		
		//khi khoi tao se update nbDigitalVideoDiscs
		this.id=nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	//đạo diễn, thể loại, tiêu đề và chi phí
    public DigitalVideoDisc(String director, String category, String title, float cost) {
    	
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        
      //khi khoi tao se update nbDigitalVideoDiscs
        this.id=nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
    }

    //tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        
      //khi khoi tao se update nbDigitalVideoDiscs
        this.id=nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
    }

}