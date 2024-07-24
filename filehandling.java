//file handling example//

// import java.io.File;
// import java.io.IOException;
// public class filehandling{

//     public static void main(String[] args) throws IOException{
      
//         File myfile=new File("C:\\Users\\ADIT-PC-03\\Desktop\\Fileshandling\\file1.txt");
//         if(myfile.exists()){
//             System.out.println("File already exists change file name");
//         }
//         else{
//            myfile.createNewFile();
//             System.out.println("File created");
//         }
       
       
//     }
// }

//file write ///
// import java.io.FileWriter;

// public class filehandling{
//     public static void main(String[] args) throws IOException{
//         FileWriter myfile=new FileWriter("C:\\Users\\ADIT-PC-03\\Desktop\\Fileshandling\\file1.txt");
//         myfile.write("hello");
//         myfile.close();
//         System.out.println("File write successfully");
       
//     }
// }   

//file read///
// import java.io.FileReader;
// import java.io.IOException;
// public class filehandling{
//     public static void main(String[] args) throws IOException{
//         FileReader myfile=new FileReader("C:\\Users\\ADIT-PC-03\\Desktop\\Fileshandling\\file1.txt");
//         int i;
//         while((i=myfile.read())!=-1){
//             System.out.print((char)i);
//         }
//         myfile.close();
//         System.out.println("File read successfully");
       
//     }
// }

//delete file///
// import java.io.File;
// import java.io.IOException;
// public class filehandling{
//     public static void main(String[] args) throws IOException{
//         File myfile=new File("myfile.txt");
//         myfile.delete();
//         System.out.println("File deleted successfully");
       
//     }
// }

import java.io.*;
import java.util.*;
public class filehandling{
    public static void main(String[] args) throws IOException{
       FileReader myfile=new FileReader("C:\\Users\\ADIT-PC-03\\Desktop\\Fileshandling\\file1.txt");
        Scanner sc=new Scanner(myfile);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}



// import java.io.File;
// import java.io.IOException;
// public class filehandling{

//     public static void main(String[] args) throws IOException{
//       for(int i=5;i<10;i++){
//         File myfile=new File("file"+i+".txt");
//         if(myfile.exists()){
//             System.out.println("File already exists change file name");
//         }
//         else{
//            myfile.createNewFile();
//             System.out.println("File created");
//         }
       
//     }
//     }
// }