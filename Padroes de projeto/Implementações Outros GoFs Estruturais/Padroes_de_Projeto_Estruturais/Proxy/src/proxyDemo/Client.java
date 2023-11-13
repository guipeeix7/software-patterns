package proxyDemo;

import proxy.ImageProxy;
import subject.Image;

public class Client {

	/**
	 * Reference: https://dzone.com/articles/design-patterns-proxy
	 * Modified by Milene.
	 */
	public static void main(String[] args) {
		
	    Image image = new ImageProxy("http://uol.com.br");
	    image.displayImage();
	}
}
