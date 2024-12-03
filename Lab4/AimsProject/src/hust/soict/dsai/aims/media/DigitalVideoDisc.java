package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
   
    private String director;
    private int length;
    
    
    
    //instance member
    //private int id;
    //classifier member
    private static int nbDigitalVideoDiscs=0;
	
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	//tiêu đề
	public DigitalVideoDisc(String title) {
		
		this.setTitle(title);
		
		//khi khoi tao se update nbDigitalVideoDiscs
		this.setId(nbDigitalVideoDiscs);
		nbDigitalVideoDiscs++;
	}
	//danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String category, String director, float cost) {
		
		this.setCategory(category);
		this.director = director;
		this.setCost(cost);
		
		//khi khoi tao se update nbDigitalVideoDiscs
		this.setId(nbDigitalVideoDiscs);
		nbDigitalVideoDiscs++;
	}
	//đạo diễn, thể loại, tiêu đề và chi phí
//    public DigitalVideoDisc(String director, String category, String title, float cost) {
//    	
//        this.director = director;
//        this.category = category;
//        this.title = title;
//        this.cost = cost;
//        
//      //khi khoi tao se update nbDigitalVideoDiscs
//        this.id=nbDigitalVideoDiscs;
//		nbDigitalVideoDiscs++;
//    }

    //tất cả các thuộc tính
//    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.length = length;
//        this.cost = cost;
//        
//      //khi khoi tao se update nbDigitalVideoDiscs
//        this.id=nbDigitalVideoDiscs;
//		nbDigitalVideoDiscs++;
//    }
	
	
	//play method
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
	

}