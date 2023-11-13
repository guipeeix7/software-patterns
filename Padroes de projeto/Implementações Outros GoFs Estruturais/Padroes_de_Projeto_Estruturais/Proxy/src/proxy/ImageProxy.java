package proxy;

import realSubject.RealImage;
import subject.Image;

public class ImageProxy implements Image{
	private String url;
	
	public ImageProxy(String url){
		this.url = url;
	}    
	
	//Method to delegate the image_display to the RealImage
	public void displayImage(){
		RealImage realImage = new RealImage(url);
		realImage.displayImage();
	}
}

