/**
 * StringBufAndBuilder
 */
public class StringBufAndBuilder {

    public static void main(String[] args) {
        String one= "Indian";
        String two= "Army";

        StringBuffer sb=new StringBuffer(20);
        StringBuilder sb2=new StringBuilder(20);
        
        sb.append(one).append(" ").append(two);
        sb2.append(one).append(" ").append(two);

        System.out.println("StringBuffer has "+sb);
        System.out.println("StringBuilder has "+sb2);

    }
}