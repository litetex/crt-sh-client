package net.litetex;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.litetex.crtsh.api.SearchApi;
import net.litetex.crtsh.model.Certificate;


public final class Application
{
	public static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	private Application()
	{
	}
	
	public static void main(final String[] args)
	{
		final SearchApi searchApi = new SearchApi();
		
		LOG.info("=== SEARCH ===");
		final List<Certificate> certificates = searchApi.search(
			"json",
			"example.org",
			"expired",
			"Y",
			null,
			null);
		LOG.info("Certificates: {}", certificates);
	}
}
