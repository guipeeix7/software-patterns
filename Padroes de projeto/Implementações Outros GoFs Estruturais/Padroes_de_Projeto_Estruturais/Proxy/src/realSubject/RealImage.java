package realSubject;

import subject.Image;

public class RealImage implements Image {
	
	String urlImage;
	
	public RealImage(String url){
		this.urlImage = url;
		System.out.println("RealImage construtor.");
		System.out.println("Specifying the url to show the image.");
	}   
	
	public void displayImage(){       
		//Display the image <<simulation>>   
		System.out.println("Displaying the url to show the image.");
		System.out.println(this.urlImage);
	}   
}