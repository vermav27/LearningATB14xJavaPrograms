package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab082_TSK_WebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the website : ");
        String website = sc.next();
        int placeOfDot = 0;
        String domain = "";
        String websiteType = "";
        int lengthOfUrl = website.length() - 1;

        for(int i = lengthOfUrl ; i >= 0 ; i--){
            if(website.charAt(i) == '.'){
                placeOfDot = i;
                break;
            }
        }

        for(int i = placeOfDot; i <= lengthOfUrl;i++){
            domain = domain + website.charAt(i);
        }

        switch (domain){
            case ".com" :
                websiteType = "Commercial website";
            break;
            case ".org" :
                websiteType = "Non-profit organization";
                break;
            case ".edu" :
                websiteType = "Educational institution";
                break;
            case ".gov" :
                websiteType = "Government website";
                break;
            case ".info" :
                websiteType = "Informational website";
                break;
            case ".net" :
                websiteType = "Network-related website";
                break;
            default:
                websiteType = "Unknown";

        }

        System.out.printf("The website type is: %s",websiteType);

    }
}
