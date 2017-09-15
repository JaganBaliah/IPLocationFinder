package org.jagan.soapwsclient.locationfinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("IPAddress input is missing");
		} else {
			String ipAddress = args[0];
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			String countryName = geoIP.getCountryName();
			String countryCode = geoIP.getCountryCode();
			System.out.println("IP Address : " + ipAddress);
			System.out.println("Country name : " + countryName);
			System.out.println("Country code : " + countryCode);
			
		}
	}
}
