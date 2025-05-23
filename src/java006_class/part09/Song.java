package java006_class.part09;


//[실행결과]
	//  노래제목: Dansing Queen
	//  가수:ABBA
	//  앨범:Arrival
	//  작곡가: Benny Andersson, Bjorn Ulvaeus
	//  년도: 1977
	//  트랙: 2

public class Song {

		String title;       //노래제목
		String artist;      //가수
		String album;       //앨범
		String[] composer;  //작곡가
		int year;           //년도
		int track;          //트랙
		
		public Song () {
			
		}
		
		public Song(String title, String artist, String album, String[] composer, int year, int track) {		
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.composer = composer;
			this.year = year;
			this.track = track;
		}
		
		public void display() {
			System.out.printf("노래제목: %s\n", title);
			System.out.printf("가수: %s\n", artist);
			System.out.printf("앨범: %s\n", album);
			System.out.printf("작곡가: ");
				for(int i=0; i <composer.length; i++) {
					System.out.printf("%s%c", composer[i], i < composer.length-1 ? ',' : '\n');
			
			}
				System.out.printf("년도: %d\n",year);
				System.out.printf("트랙: %d\n",track);
		}
		
	}//end class
