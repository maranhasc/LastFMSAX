package model;


public class Artista {
	private int rank;
	private String nombre;
	private int playcount;
	private String url;
	private String image;
	
	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artista(int rank, String nombre, int playcount, String url, String image) {
		super();
		this.rank = rank;
		this.nombre = nombre;
		this.playcount = playcount;
		this.url = url;
		this.image = image;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPlaycount() {
		return playcount;
	}

	public void setPlaycount(int playcount) {
		this.playcount = playcount;
	}

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Artista [rank=" + rank + ", nombre=" + nombre + ", playcount=" + playcount + ", url="
				+ url + ", image=" + image + "]";
	}
}
