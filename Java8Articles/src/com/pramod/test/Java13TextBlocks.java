package com.pramod.test;

public class Java13TextBlocks {

	public static void main(String[] args) {
		
		System.out.println(getBlockOfHtml());
	}
	public static String getBlockOfHtml() {
	    return """
	            <html>

	                <body>
	                    <span>example text</span>
	                </body>
	            </html>""";
	}
}
