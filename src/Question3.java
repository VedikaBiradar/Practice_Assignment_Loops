public class Question3 {

    /*Suppose the tuition for a university is $10,000 for
    the current year and increases by 7 percent every year.
    In how many years will the tuition be doubled?
     */

    public void tutionFee(){
        //given information
       double firstfee=10000;
       double finalfee=firstfee*2;
       double currentfee=firstfee;
       int i=0;

       //checking condition
       while(currentfee<finalfee){
           currentfee=currentfee*(1+0.07);
           i++;

       }
        System.out.println("after " +i+" Years the fee will be double "+currentfee);
    }
}
