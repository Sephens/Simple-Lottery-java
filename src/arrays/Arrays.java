
package arrays;


public class Arrays {
    
    
    public Arrays(){
        String[] county = {
            "Kisumu", "Nairobi", "Mombasa", "Bungoma","Kiambu","Turkana","Embu","Kakamega","Voi","Wajir","Mandera"
                ,"Baringo", "Transzoia",""
        } ;
        
        String[] student= {
            "Joy", "Kelvin", "Barasa", "Brian","Kate","Tyson","Emmaculate","Krishna","Violet","Wambo","Mark"
                ,"Bridgit", "Timothy",""
        } ;
        
        String[] feeBal = {
            "1000", "20,000", "300", "1130","12000","110","3000","2001","20","119","222"
                ,"0", "43000",""
        } ;
        
        int totalCounty = county.length;
        int totalStudent = student.length;
        int totalfeeBal = feeBal.length;
        
        
        int countyRan = (int)(Math.random()*totalCounty);
        int studRan = (int)(Math.random()*totalStudent);
        int feeBalRan = (int)(Math.random()*totalfeeBal);
        
        
        String phrase = student[studRan]+"\t"+county[countyRan]+"\t"+feeBal[feeBalRan];
        
        System.out.println("Random Selections: "+phrase);
    }
    
    public static void main(String[] args) {
        Arrays ar = new Arrays();
    }
    
}
