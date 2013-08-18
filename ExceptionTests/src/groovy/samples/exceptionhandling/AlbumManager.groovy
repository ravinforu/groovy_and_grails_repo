package groovy.samples.exceptionhandling

class AlbumManager {

	def createAlbum(def name, def artist, def trackList) {
		if (name == "" || name == null) {
			throw new InvalidAlbumNameException("Album name should be valid and cannot be empty")
		}
		new Album(name: name, artist: artist, tracks: trackList)
	}
}
