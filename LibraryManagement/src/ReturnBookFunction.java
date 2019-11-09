
public class ReturnBookFunction {
    public static void main(String args[])
    {
        
    }
    public int dayCalculation(int a1,int b1,int c1,int a2,int b2,int c2)
    {
        int day=0,doNotEnter=0;
            int intDate=a1,intMnth=b1,intYr=c1;
            int rtnDate=a2,rtnMnth=b2,rtnYr=c2;
           
            if(intMnth>rtnMnth)
            {
                if(rtnYr>intYr)
                rtnMnth=12+rtnMnth;
                else
                doNotEnter=1;
                    System.out.println("intMnth > rtnMnth entered");
            }
             if((intMnth==rtnMnth)&&(intYr==rtnYr))
            {
                day=rtnDate-intDate;
                System.out.println("equl to entered");
            }
            else
            {
                if(!(doNotEnter==1))
                {
                      System.out.println("For loop section entered");
            for(int i=intMnth;i<=rtnMnth;i++)
            {
                if(!(intMnth==rtnMnth))
                {
                if(i==intMnth)
                {
                     if(i==2)
                     {
                         day=28-intDate;
                       }
                       else if((i==4)||(i==6)||(i==9)||(i==11))
                            day=30-intDate;
                        else
                             day=31-intDate;
                }
                else if(i==rtnMnth)
                    day=day+rtnDate;
                else
                {
                     if((i%12)==2)
                     {
                         day=day+28;
                       }
                       else if(((i%12)==4)||((i%12)==6)||((i%12)==9)||((i%12)==11))
                            day=day+30;
                        else
                             day=day+31;
                }
            }
            }
            }
            }
           
             day=day+(rtnYr-intYr)*365;
             if(day<0)
                 day=0;
return day;
    }
}
