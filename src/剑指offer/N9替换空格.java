package 剑指offer;

//请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
//则经过替换之后的字符串为We%20Are%20Happy。
public class N9替换空格  {
	
	    public String replaceSpace(StringBuffer str) {
	        String s = str.toString();
	      
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' ')
	                sb.append("%20");
	            else{
	                sb.append(s.charAt(i));
	            }      
	        }
	       return sb.toString();     
	    }
}
  


