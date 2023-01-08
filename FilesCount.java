/* 4. Write a java program to count the list of files based on their extension using File class. 
      Display following files count on console. 
     ==> Number of text files
     ==> Number of document files
     ==> Number of image files
     ==> Number of other files

   Sample Input: Create folder and create different files such as document, pdf, image and text files.

   Expected Output: 
    Number of text files: 5
    Number of document files: 3
    Number of image files: 4
    Number of other files: 3
*/



import java.io.*;

 

class FilesCount {
  public static void main(String args[]) throws IOException {
    int textCount = 0, pdfCount = 0, docxCount = 0, imageCount = 0, songCount = 0, videoCount = 0;
try{
   File file = new File("/home/runner/Java-Beginner-tavi7842/FileHandlingUsingByteStreams_Assignment-tavi7842/Assignment_5");
   // System.out.println(file.getAbsoluteFile());
    String listf[] = file.list();
    for (int i = 0; i < listf.length; i++) {
      if (listf[i].endsWith(".txt")) {
        textCount++;
      } else if (listf[i].endsWith(".pdf")) {
        pdfCount++;
      } else if (listf[i].endsWith(".docx") || listf[i].endsWith(".doc")) {
        docxCount++;
      } else if (listf[i].endsWith(".mp3")) {
        songCount++;
      } else if (listf[i].endsWith(".mp4")) {
        videoCount++;
      } else {
        imageCount++;
      }
    }
    System.out.println("Number of text files :" + textCount);
    System.out.println("Number of document files :"+ docxCount);
    System.out.println("Number of PDF files. :"+pdfCount);
    System.out.println("Number of audio files :"+songCount);
    System.out.println("Number of video files :"+videoCount);
    System.out.println("Number of image files :"+imageCount);
}
   catch(Exception e){
     System.out.println(e);
   }
  }
}