package run;

interface MediaPlayer{
	public void play();
}

interface AdvancedMediaPlayer{
	public void playFile(String filename);
}

class Mp3Player implements MediaPlayer{
	public void play() {
		System.out.println("Mp3 media is playing");	}
}

class Mp4Player implements AdvancedMediaPlayer{
	public void playFile(String filename) {
		System.out.println("Media is playing from "+filename+" by MP4 Player");	}
}
class VLCPlayer implements AdvancedMediaPlayer{
	public void playFile(String filename) {
		System.out.println("Media is playing from "+filename+" by VLC Player");	}
}


class MediaPlayerAdapter implements AdvancedMediaPlayer{
	private AdvancedMediaPlayer adp;
	public AdvancedMediaPlayer getAdp() {
		return adp;
	}
	public void setAdp(AdvancedMediaPlayer adp) {
		this.adp = adp;
	}
	public MediaPlayerAdapter(AdvancedMediaPlayer amp) {
		this.adp=amp;
		
	}
	@Override
	public void playFile(String filename) {
		// TODO Auto-generated method stub
		System.out.print("\n Playing from adapter :  ");
		adp.playFile(filename);
	}
}


public class Main {
	public static void main(String[] args) {
		MediaPlayer p = new Mp3Player();
		p.play();
		AdvancedMediaPlayer pp = new MediaPlayerAdapter(new Mp4Player());
		pp.playFile("Speach.mp4");
		pp = new MediaPlayerAdapter(new VLCPlayer());
		pp.playFile("Oppenhimer BluRay 4K.mp4");
		
	}

}
