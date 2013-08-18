package groovy.sample.exceptionhandling.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import groovy.samples.exceptionhandling.AlbumManager
import groovy.samples.exceptionhandling.InvalidAlbumNameException;
import junit.framework.TestCase;

class AlbumManagerTest {
	@Test
	def void testCreateAlbum() {
		AlbumManager albumManager = new AlbumManager()
		try {
			albumManager.createAlbum("", "Ilayaraja", ["Kaatrai Konjam", "Mudhal Murai", "Satru Munbu", "Saayndhu Saayndhu", "Vaanam Mella", "Yennodu Vaa Vaa"])
		} catch (e) {
			println e
			assert e in InvalidAlbumNameException
		}		
	}
}
