package java016_stream;

import java.io.File;

public class Java178_stream {

	public static void main(String[] args) {
		// java016_stream/a/b 디렉토리에 red.txt, test.txt 2개의 파일 생성해 놓는다.
		File file = new File("src/java016_stream/a");
		// System.out.println(file.listFiles()[0]);
		//삭제파일이나 폴더가 있으면 true, 아니면 false을 리턴한다.
		//boolean chk = file.delete();
		//System.out.println(chk);
		deleteFileList(file);
	}// end main()

	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		System.out.println(fileAll.length);

		if (fileAll.length != 0) {
			for (File file : fileAll) {
				System.out.println(file);
				if (file.isFile()) {
					file.delete(); // 파일 삭제
				} else {
					deleteFileList(file);
				}
			} // end for
		}
		System.out.println("Remove File:" + srcFile.getPath());
		srcFile.delete(); //현재 폴더 삭제(a, b)
	}// end deleteFileList()

}// end class
