package Lecture15;

import java.util.Scanner;

public class String_Inbuilt_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "I love Java";
        System.out.println(s.toUpperCase());
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);
        String name = "    Osheen     Jain          ";
        System.out.println(name.length());
        System.out.println(name.strip());
        System.out.println(name.strip().length());
        System.out.println(name.stripTrailing());
        System.out.println(name.stripTrailing().length());
        System.out.println(name.stripLeading());
        System.out.println(name.stripLeading().length());
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        s = s.replace("java","Java and Python");
        System.out.println(s);
        if (s.contains("Java")){
            System.out.println("Yes, it is containing Java");
        }
        else {
            System.out.println("No, it is not containing Java");
        }

        String s1 = new String("Hello" + "World");
        System.out.println(s1);

        String s2 = s.substring(2,9); // return a substring from s from index 2 to 9
        System.out.println(s2);

        String[] filename = {"img.csv" , "img1.pdf" , "img3.sys" , "img4.pdf" , "img3pdf.kite.pdf"};
        for (String f : filename){
            if(f.endsWith(".pdf")){
                System.out.println(f);
            }
        }

        String doc = "this is a very large document on java, java has multiple large features in java to make programming easier";
        String wordToFind = "java";
        int index = doc .indexOf(wordToFind);

        while(index != -1){
            System.out.println(index);;
            // find next occurrence
            index = doc.indexOf(wordToFind, index+1);
        }

        // StringBuilder class usage
        // Strings are mutable here, you can do modification on it.
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.append(" World");
        sb.append(" World");
        sb.append(" World");
        sb.insert(0,"Hello ");
        System.out.println(sb.toString());

    }
}
