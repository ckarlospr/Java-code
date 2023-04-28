package Excercise;

/**
 * Lexicographic
 */
public class Lexicographic {
    public static void main(String[] args){

    }


    public static void lexicographical(){
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        String smallest = "";
        String largest = "";
        
        for(int i=0; i<s.length()-2; i++){
            String data = s.substring(i, i+3);
            System.out.println(data);
            System.out.println("data: "+data+" < smallest: "+smallest+" - "+data.compareTo(smallest));
            System.out.println("data: "+data+" < largest: "+largest+" - "+data.compareTo(largest));
            if(smallest.equals("") ){
                smallest=data;
            }else if(largest.equals("")){
                largest=data;
            }
            if(data.compareTo(smallest)<0){
                
                smallest=data;
                //System.out.println("s-"+smallest);
            }else if(data.compareTo(largest)>0){
                
                largest=data;
                //System.out.println("l-"+largest);
            }
            System.out.println("-->s-"+smallest);
            System.out.println("-->l-"+largest);
        }
        System.out.println("s-"+smallest);
        System.out.println("l-"+largest);
        
    }
    
}

