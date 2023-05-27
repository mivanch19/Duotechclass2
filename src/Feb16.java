public class Feb16 {
    public static void main(String[] args){
      launchBrowser("Safari");
    }
    public static void launchBrowser(String browser){
       // if (browser.equals("Chrome")){
        //   System.out.println("Chrome");
        //}else if (browser.equals("Edge")) {
        //  System.out.println("Edge");
        // }else if (browser.equals("Firefox")) {
        // System.out.println("Firefox");
        //}else if (browser.equals("Safari")) {
        //  System.out.println("Safari");
        //}else {System.out.println("Invalid");}

      switch (browser)  {
          case "Chrome":
              System.out.println("Chrome");
              break;
          case "Edge":
              System.out.println("Edge");
              break;
          default:
              System.out.println("Invalid");
              break;
      }



    }
}
