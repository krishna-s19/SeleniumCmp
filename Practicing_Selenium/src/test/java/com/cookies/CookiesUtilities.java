package com.cookies;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.openbrowser.BrowserUtilities;

public class CookiesUtilities {
	public BrowserUtilities bu;

	@Test
	public int getCookiesCount(RemoteWebDriver d) {
		Set<Cookie> result = d.manage().getCookies();
		return result.size();
	}

	public List<String> getCookiesList(RemoteWebDriver d) {
		Set<Cookie> name = d.manage().getCookies();
		List<Cookie> l = new ArrayList<Cookie>(name);
		List<String> cname = new ArrayList<String>();
		for (Cookie c : l) {
			cname.add(c.getName() + "----" + c.getValue() + "===" + c.getDomain() + "====" + c.getExpiry());
		}
		return cname;
	}

	public List<String> getCookieType(RemoteWebDriver d, String sameDomain, String superDomain) {
		Set<Cookie> name = d.manage().getCookies();
		List<Cookie> l = new ArrayList<Cookie>(name);
		List<String> type = new ArrayList<String>();
		for (Cookie c : l) {

			if (c.isHttpOnly()) {
				if (c.getExpiry() == null)
					type.add(c.getName() + "is Http -only Session cookie");
				else
					type.add(c.getName() + "is Http - only persistance cookie it Expiry on   :" + c.getExpiry());
			} else if (c.isSecure()) {
				if (c.getExpiry() == null)
					type.add(c.getName() + "Secured session cookie");
				else
					type.add(c.getName() + "is Secured persistance cookie and it expire on " + c.getExpiry());
			} else if (c.getDomain().contains(sameDomain)) {
				type.add(c.getName() + "is same-site cookie");
			} else if (c.getName().contains(superDomain)) {
				type.add(c.getName() + "is super cookie");
			} else {
				type.add(c.getName() + "is Thired party cookie and it came from " + c.getDomain());
			}
		}
		return type;
	}

	public void addNewCookies(RemoteWebDriver d, String name, String value, String domain, String path, Date expiry,
			boolean isSecure, boolean isHttpOnly, String sameSite) {
		Cookie c = new Cookie(name, value, domain, path, expiry, isSecure, isHttpOnly, sameSite);
		d.manage().addCookie(c);
	}

	public void addNewViaBuilder(RemoteWebDriver d, String name, String value, String domain, String path, Date expiry,
			boolean isSecure, boolean isHttpOnly, String sameSite) {

		Cookie.Builder b = new Cookie.Builder(name, value);
		Cookie c = b.domain(domain).path(path).expiresOn(expiry).isHttpOnly(isHttpOnly).sameSite(sameSite).build();
		d.manage().addCookie(c);
	}
}