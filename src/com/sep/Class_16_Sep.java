package com.sep;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Sep16 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void getURL() {
		
		String url = "http://ccm-qnb.godigit.com/external/services/digit/report/pdfLink?policyNumber=D006697751&communicationFlag=false";
		System.out.println(url);
	}
	
	private String setString() {
		
		return "Hello";
	}
	
	public void getUR1L() {
		
		String url = "http://ccm-qnb.godigit.com/external/services/digit/report/pdfLink?policyNumber=D006697751&communicationFlag=false";
		System.out.println(url);
	}
}

class Sep16Extends extends Sep16{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void getURL() {
		
		
	};
	/*  always vesibility should be more than to parent class
	 * @Override protected void getUR1L() {
	 * 
	 * String url =
	 * "http://ccm-qnb.godigit.com/external/services/digit/report/pdfLink?policyNumber=D006697751&communicationFlag=false";
	 * System.out.println(url); }
	 */
}
public class Class_16_Sep {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("ABC");
		list.add("ABC1");
		list.add("ABC2");
		list.add("ABC3");
		list.add("ABC4");
		
		List<String> listAdd = new ArrayList<String>();
		
		listAdd.add("Hello");
		listAdd.addAll(list);
		
		Iterator<String> itr = listAdd.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		URL url = new URL("http://ccm-qnb.godigit.com/external/services/digit/report/pdfLink?policyNumber=D006697751&communicationFlag=false");
        
        System.out.println("URL is " + url.toString());
        System.out.println("protocol is " + url.getProtocol());
        System.out.println("authority is " + url.getAuthority());
        System.out.println("file name is " + url.getFile());
        System.out.println("host is " + url.getHost());
        System.out.println("path is " + url.getPath());
        System.out.println("port is " + url.getPort());
        System.out.println("default port is " + url.getDefaultPort());
        System.out.println("query is " + url.getQuery());
        System.out.println("ref is " + url.getRef());
        
	}

}
