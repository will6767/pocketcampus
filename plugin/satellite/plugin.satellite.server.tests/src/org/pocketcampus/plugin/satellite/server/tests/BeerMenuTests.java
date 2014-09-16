package org.pocketcampus.plugin.satellite.server.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.pocketcampus.platform.server.HttpClient;
import org.pocketcampus.plugin.satellite.server.BeerMenuImpl;
import org.pocketcampus.plugin.satellite.shared.*;

/**
 * Tests for BeerMenuImpl.
 * 
 * @author Solal Pirelli <solal.pirelli@epfl.ch>
 */
public final class BeerMenuTests {
	@Test
	public void draftBeersOfTheMonth() {
		List<SatelliteBeer> beers = getBeers().get(SatelliteBeerContainer.DRAFT).getBeersOfTheMonth();

		assertEquals(1, beers.size());

		SatelliteBeer beer = beers.get(0);

		assertEquals("St-Feuillien Saison", beer.getName());
		assertEquals("St-Feuillien", beer.getBreweryName());
		assertEquals("Belgique", beer.getOriginCountry());
		assertEquals(6.5, beer.getAlcoholRate(), Double.MIN_VALUE);
		assertEquals(4, beer.getPrice(), Double.MIN_VALUE);
		assertEquals(
				"Bière de terroir par excellence, la Saison trouve son origine dans les fermes-brasseries du Sud de la Belgique, et principalement en Hainaut. A l’époque, cette bière peu alcoolisée et rafraîchissante étanchait la soif des ouvriers saisonniers.\r\nA la Brasserie St-Feuillien, la Saison est une bière de fermentation haute, refermentée en bouteille, non filtrée, d’un chaleureux blond doré. Son profil aromatique est tout en nuances et son amertume bien marquée, l’ensemble soutenu par une belle plénitude en bouche. Un grand classique.",
				beer.getDescription());
	}

	@Test
	public void bottledBeer() {
		SatelliteBeer beer = getBeers().get(SatelliteBeerContainer.BOTTLE).getBeers().get("Vieille Brune").get(0);

		assertEquals("Duchesse de Bourgogne", beer.getName());
		assertEquals("Verhaeghe", beer.getBreweryName());
		assertEquals("Belgique", beer.getOriginCountry());
		assertEquals(6.2, beer.getAlcoholRate(), Double.MIN_VALUE);
		assertEquals(4, beer.getPrice(), Double.MIN_VALUE);
		assertEquals("Bière de haute fermentation, mûrie en fût de chêne. Ceci lui confère un goût entre lambic et cidre, fruitée et acide à la fois.", beer.getDescription());
	}

	@Test
	public void beerWithNoCapsInType() {
		SatelliteBeer beer = getBeers().get(SatelliteBeerContainer.BOTTLE).getBeers().get("Brune").get(1);

		assertEquals("Gulden Draak", beer.getName());
	}

	private static Map<SatelliteBeerContainer, SatelliteMenuPart> getBeers() {
		try {
			return new BeerMenuImpl(new TestHttpClient()).get().getBeerList();
		} catch (Exception e) {
			fail("An exception occurred.");
			return null;
		}
	}

	private static final class TestHttpClient implements HttpClient {
		private static final String RETURN_VALUE = getFileContents("ExampleBeerFeed.xml");

		@Override
		public String get(String url, Charset charset) throws IOException {
			return RETURN_VALUE;
		}

		@Override
		public String post(String url, byte[] body, Charset charset) throws IOException {
			throw new RuntimeException("post(String, byte[], Charset) should not be called.");
		}

		@SuppressWarnings("resource")
		private static String getFileContents(String name) {
			Scanner s = null;

			try {
				InputStream stream = new BeerMenuTests().getClass().getResourceAsStream(name);
				BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

				// smart trick from http://stackoverflow.com/a/5445161
				s = new Scanner(reader).useDelimiter("\\A");
				return s.hasNext() ? s.next() : "";
			} finally {
				if (s != null) {
					s.close();
				}
			}
		}
	}
}