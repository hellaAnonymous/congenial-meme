public class albCompare {
	public static void main(String[] args) {   
		var albALC = 9;
    var albBLC = 9;
    var albAL = 53;
    var albBL = 53;
    boolean sNs = albALC == albBLC;
    int dL = 0;
    if(albAL>albBL) {
      dL = albAL - albBL;
    }
    if(albAL<albBL) {
      dL = albBL - albAL;
    }
    String albsAS = "The two unnamed albs are the same!";
    String albsANS = "The two unnamed albs are not the same!";
    if(sNs == true && dL == 0) {
      System.out.println(albsAS);
    }
    else {
      System.out.println(albsANS);
    }
  }
}
